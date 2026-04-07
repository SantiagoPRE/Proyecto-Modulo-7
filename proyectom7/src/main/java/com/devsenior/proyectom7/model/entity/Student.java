package com.devsenior.proyectom7.model.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
    @OneToMany(mappedBy = "estudiante")
    private List<Enrollment> inscripciones;
     

}