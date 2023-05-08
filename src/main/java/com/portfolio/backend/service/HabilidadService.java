package com.portfolio.backend.service;

import com.portfolio.backend.model.Habilidad;
import com.portfolio.backend.repository.IHabilidadRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabilidadService implements IHabilidadService{
    @Autowired IHabilidadRepository repoh;
    
    @Override
    public List<Habilidad> traerHabilidades() {
        return repoh.findAll(); 
    }

    @Override
    public void crearHabilidad(Habilidad h) {
        repoh.save(h);
    }

    @Override
    public Habilidad modificarHabilidad(Long id) {
        return repoh.findById(id).orElse(null);
    }

    @Override
    public void eliminarHabilidad(Long id) {
        repoh.deleteById(id);
    }
    
}
