package com.portfolio.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Habilidad {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nombreHabilidad;
    private Long porcentajeHabilidad;

    public Habilidad() {
    }

    public Habilidad(Long id, String nombreHabilidad, Long porcentajeHabilidad) {
        this.id = id;
        this.nombreHabilidad = nombreHabilidad;
        this.porcentajeHabilidad = porcentajeHabilidad;
    }

    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreHabilidad() {
        return nombreHabilidad;
    }

    public void setNombreHabilidad(String nombreHabilidad) {
        this.nombreHabilidad = nombreHabilidad;
    }

    public Long getPorcentajeHabilidad() {
        return porcentajeHabilidad;
    }

    public void setPorcentajeHabilidad(Long porcentajeHabilidad) {
        this.porcentajeHabilidad = porcentajeHabilidad;
    }
    
    
}
