package com.portfolio.backend.service;

import com.portfolio.backend.model.Experiencia;
import com.portfolio.backend.repository.IExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService{
    @Autowired IExperienciaRepository experienciarepo;
    @Override
    public List<Experiencia> traerExperiencia() {
        return experienciarepo.findAll();
    }

    @Override
    public void borrarExperiencia(Long id) {
        experienciarepo.deleteById(id);
    }

    @Override
    public void crearExperiencia(Experiencia e) {
        experienciarepo.save(e);
    }

    @Override
    public Experiencia modificarExperiencia(Long id) {
        return experienciarepo.findById(id).orElse(null);
    }
    
}
