package com.devsenior.proyectom7.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Course {

    @Id
    @Column(name = "codigo_curso")
    private Long codigoCurso;
    @Column(nullable = false,length = 100)
    private String nombre;
    @Column(nullable = false,length = 200)
    private String descripcion;
    @Column(nullable = false)
    private Integer capacidad;
    @ManyToOne
    @JoinColumn(name = "numeroDeProfesor", nullable = false)
    private Professor professor;
}
