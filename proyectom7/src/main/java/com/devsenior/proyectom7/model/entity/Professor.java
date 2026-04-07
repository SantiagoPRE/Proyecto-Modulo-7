package com.devsenior.proyectom7.model.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Professor {

    @Id
    @Column(name = "numero_profesor")
    private Long numeroDeProfesor;
    @Column( nullable = false,length = 100)   
    private String nombre;
    @Column( nullable = false,length = 100)
    private String departamento;
    @Column(unique = true, nullable = false,length = 100)
    private String correo;
    @OneToMany(mappedBy = "professor")
    private List<Course> cursos;
}
