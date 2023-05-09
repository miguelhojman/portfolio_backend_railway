package com.portfolio.backend.controller;

import com.portfolio.backend.model.Habilidad;
import com.portfolio.backend.service.HabilidadService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController

//Éste CORS es para aceptar el front de Firebase:
@CrossOrigin(origins = "https://segunda-front.web.app/")

public class HabilidadController {
    @Autowired HabilidadService servicioh;
    
    @GetMapping("/traerhabilidades")
    public List<Habilidad> traerHabilidades(){
        return servicioh.traerHabilidades();
    }
    
    //traigo los datos en el body (@RequestBody Habilidad h).
    //Y no en la url como en las masterclass (con @RequestParam)
    @PutMapping("/modificarhabilidad")
    public Habilidad modificarHabilidad(@RequestBody Habilidad h) {     
        servicioh.crearHabilidad(h);
        return h;
    }
    
    @PostMapping("/crearhabilidad")
    public void crearHabilidad(@RequestBody Habilidad h){
        servicioh.crearHabilidad(h);
    }
    
   //Hago return servicioh.traerHabilidades()para que despues de eliminar me vuelva a cargar las habilidades
   //Si no, no me recarga y no actualiza el componente
    @DeleteMapping("/eliminarhabilidad/{id}")
    public List<Habilidad> eliminarHabilidad(@PathVariable Long id){
        servicioh.eliminarHabilidad(id);
        return servicioh.traerHabilidades();
    }
    
}
