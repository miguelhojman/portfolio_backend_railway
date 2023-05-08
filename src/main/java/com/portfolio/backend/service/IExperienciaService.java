package com.portfolio.backend.service;

import com.portfolio.backend.model.Experiencia;
import java.util.List;


public interface IExperienciaService {
    
    public List <Experiencia> traerExperiencia();
    
    public void borrarExperiencia(Long id);
    
    public void crearExperiencia(Experiencia e);
    
    public Experiencia modificarExperiencia(Long id);
}
