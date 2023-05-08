package com.portfolio.backend.service;

import com.portfolio.backend.model.Educacion;
import java.util.List;


public interface IEducacionService {
    
    public List<Educacion> traerEducacion();
    
    public void crearEducacion(Educacion e);
    
    public Educacion modificarEducacion(Long id);
    
    public void eliminarEducacion(Long id);    
  
}
