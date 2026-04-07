package com.devsenior.proyectom7.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Student {

    @Id
    @Column(name = "numero_estudiante")
    private Long numeroDeEstudiante;
    @Column(nullable = false,length = 100)
    private String nombre;
    @Column(unique = true, nullable = false,length = 100)
    private String correo;
     

}