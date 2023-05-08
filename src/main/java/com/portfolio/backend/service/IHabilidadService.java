package com.portfolio.backend.service;

import com.portfolio.backend.model.Habilidad;
import java.util.List;


public interface IHabilidadService {
    
    public List<Habilidad> traerHabilidades();
    
    public void crearHabilidad(Habilidad h);
    
    public Habilidad modificarHabilidad(Long id);
    
    public void eliminarHabilidad(Long id);
    
}
