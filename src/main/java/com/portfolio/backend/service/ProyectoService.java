package com.portfolio.backend.service;

import com.portfolio.backend.model.Proyecto;
import com.portfolio.backend.repository.IProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements IProyectoService{
    @Autowired IProyectoRepository proyectorepo;

    @Override
    public List<Proyecto> traerProyectos() {
        return proyectorepo.findAll();
    }

    @Override
    public void borrarProyecto(Long id) {
        proyectorepo.deleteById(id);
    }

    @Override
    public void crearProyecto(Proyecto p) {
        proyectorepo.save(p);
    }

    @Override
    public Proyecto modificarProyecto(Long id) {
        return proyectorepo.findById(id).orElse(null);
    }
}
