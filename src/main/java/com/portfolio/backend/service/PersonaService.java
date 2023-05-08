package com.portfolio.backend.service;

import com.portfolio.backend.model.Persona;
import com.portfolio.backend.repository.IPersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService {

    @Autowired
    IPersonaRepository repo;

    @Override
    public Persona traerPersona(Long id) {
        return repo.findById(id).orElse(null);
    }
    
    @Override
    public void crearPersona(Persona p) {
        repo.save(p);
    }

    @Override
    public void eliminarPersona(Long id) {
        repo.deleteById(id);
    }

    @Override
    public Persona modificarPersona(Long id) {
        return repo.findById(id).orElse(null);
    }
}
