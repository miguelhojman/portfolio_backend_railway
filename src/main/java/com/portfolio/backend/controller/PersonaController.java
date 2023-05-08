package com.portfolio.backend.controller;

import com.portfolio.backend.model.Persona;
import com.portfolio.backend.service.PersonaService;
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

public class PersonaController {

    @Autowired
    PersonaService servicio;
    
    @GetMapping("/traer/{id}")
    public Persona traerUno(@PathVariable Long id) {
        return servicio.traerPersona(id);
    }    
    
    @PutMapping("/modificar")
     public Persona modificarPersona(@RequestBody Persona p) {     
        servicio.crearPersona(p);
        return p;
    }       
    
    @PostMapping("/crear")
    public void crearPersona(@RequestBody Persona p) {
        servicio.crearPersona(p);
    }
    //no se tiene que poder eliminar persona!!!!!!!!
    @DeleteMapping("/eliminar/{id}")
    public void eliminarPersona(@PathVariable Long id) {
        servicio.eliminarPersona(id);
    }
    
     
}
