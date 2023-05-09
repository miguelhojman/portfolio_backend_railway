package com.portfolio.backend.controller;

import com.portfolio.backend.model.Proyecto;
import com.portfolio.backend.service.ProyectoService;
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

public class ProyectoController {

    @Autowired
    ProyectoService proyeservice;

    @GetMapping("/traerproyectos")
    public List<Proyecto> traerProyectos() {
        return proyeservice.traerProyectos();
    }

    @PostMapping("/crearproyecto")
    public void crearProyecto(@RequestBody Proyecto p) {
        proyeservice.crearProyecto(p);
    }

    @DeleteMapping("/borrarproyecto/{id}")
   public List<Proyecto> eliminarProyecto(@PathVariable Long id){
        proyeservice.borrarProyecto(id);
        return proyeservice.traerProyectos();
    }
    
     @PutMapping("/modificarproyecto")
    public Proyecto modificarProyecto(@RequestBody Proyecto p) {     
        proyeservice.crearProyecto(p);
        return p;
    }
    
}
