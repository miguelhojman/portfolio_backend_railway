package com.portfolio.backend.service;

import com.portfolio.backend.model.Educacion;
import com.portfolio.backend.repository.IEducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService{
    
    @Autowired IEducacionRepository edurepo;

    @Override
    public List <Educacion> traerEducacion() {
               return edurepo.findAll();     
    }

    @Override
    public void crearEducacion(Educacion e) {
        edurepo.save(e);
    }

    @Override
    public Educacion modificarEducacion(Long id) {
        return edurepo.findById(id).orElse(null);
    }

    @Override
    public void eliminarEducacion(Long id) {
        edurepo.deleteById(id);
    }
    
}
