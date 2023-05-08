package com.portfolio.backend.service;

import com.portfolio.backend.model.Persona;

public interface IPersonaService {
   
    public Persona traerPersona(Long id);
   
    public void crearPersona(Persona p);
   
    public void eliminarPersona(Long id);
   
    public Persona modificarPersona(Long id);    
    
}
