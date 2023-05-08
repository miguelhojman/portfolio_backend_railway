
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
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private  String nivel;
    private String institucion;
    private String descripcion;
    
     public Educacion() {
    }


    public Educacion(Long id, String nivel, String institucion, String descripcion) {
        this.id = id;
        this.nivel = nivel;
        this.institucion = institucion;
        this.descripcion = descripcion;
    }
}
