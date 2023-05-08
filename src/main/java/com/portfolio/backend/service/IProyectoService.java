package com.portfolio.backend.service;

import com.portfolio.backend.model.Proyecto;
import java.util.List;


public interface IProyectoService {
    
    public List<Proyecto> traerProyectos();
    
    public void borrarProyecto(Long id);
    
    public void crearProyecto(Proyecto p);
    
    public Proyecto modificarProyecto(Long id);
}
