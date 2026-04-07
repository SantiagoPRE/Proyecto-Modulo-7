package com.devsenior.proyectom7.model.entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Enrollment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String idIncripcion;
    @ManyToOne
    @JoinColumn( name= "numero_estudiante",nullable = false)
     private Student estudiante;
     @ManyToOne
     @JoinColumn( name= "codigo_curso",nullable = false)
     private Course curso;
      @Column( nullable = false)
     private LocalDate fechaInscripcion;
      @Column( nullable = false)
     private String estadoInscripcion;
}
