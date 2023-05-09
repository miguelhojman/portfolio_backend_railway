package com.portfolio.backend.controller;

import com.portfolio.backend.model.Experiencia;
import com.portfolio.backend.service.ExperienciaService;
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

public class ExperienciaController {

    @Autowired
    ExperienciaService experienciaserv;

    @GetMapping("/traerexperiencia")
    public List<Experiencia> traerExperiencia() {
        return experienciaserv.traerExperiencia();
    }

    @PostMapping("/crearexperiencia")
    public void crearExperiencia(@RequestBody Experiencia e) {
        experienciaserv.crearExperiencia(e);
    }

    @DeleteMapping("/borrarexperiencia/{id}")
    public List<Experiencia> eliminarExperiencia(@PathVariable Long id){
        experienciaserv.borrarExperiencia(id);
        return experienciaserv.traerExperiencia();
    }
    
    //traigo los datos en el body (@RequestBody Experiencia e).
    //Y no en la url como en las masterclass (con @RequestParam)
    @PutMapping("/modificarexperiencia")
    public Experiencia modificarExperiencia(@RequestBody Experiencia e) {     
       experienciaserv.crearExperiencia(e);
        return e;
    }    
}
