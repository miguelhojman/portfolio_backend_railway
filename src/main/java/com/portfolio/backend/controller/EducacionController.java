 package com.portfolio.backend.controller;

import com.portfolio.backend.model.Educacion;
import com.portfolio.backend.service.EducacionService;
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
//Éste CORS es para trabajo local:
//@CrossOrigin(origins = "http://localhost:4200")

//Éste CORS es para aceptar el front de Firebase:
@CrossOrigin(origins = "https://portfolio-5e022.web.app")

public class EducacionController {
    @Autowired EducacionService eduservice;
        
    @GetMapping("/traereducacion")    
     public List<Educacion> traerEducacion(){
        return eduservice.traerEducacion();
    }
     
     @PutMapping("/modificareducacion")
    public Educacion modificarEducacion(@RequestBody Educacion e) {     
        eduservice.crearEducacion(e);
        return e;
    }      
    
    @PostMapping("/creareducacion")
    public void crearEducacion(@RequestBody Educacion e){
        eduservice.crearEducacion(e);
    }
    
    @DeleteMapping("/eliminareducacion/{id}")
    public List<Educacion> eliminarEducacion(@PathVariable Long id){
        eduservice.eliminarEducacion(id);
        return eduservice.traerEducacion();
    }    
}
