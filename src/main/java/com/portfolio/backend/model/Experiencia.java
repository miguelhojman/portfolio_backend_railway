package com.portfolio.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String empresa;  
    private String rubro;
    private String periodo;
    private String tarea;

    public Experiencia() {
    }

    public Experiencia(Long id, String empresa, String rubro, String periodo, String tarea) {
        this.id = id;
        this.empresa = empresa;
        this.rubro = rubro;
        this.periodo = periodo;
        this.tarea = tarea;
    }
    
    

}
