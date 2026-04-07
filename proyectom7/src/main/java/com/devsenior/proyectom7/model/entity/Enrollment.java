package com.devsenior.proyectom7.model.entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Entity
@Data
public class Enrollment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_inscripcion")
    private String idIncripcion;
    @ManyToMany
    @JoinTable(name = "cursos_inscritos", joinColumns = @JoinColumn(name="numero_estudiante"),inverseJoinColumns=@JoinColumn(name="codigo_curso"))
     private List<Student> estudiante;
     @ManyToMany(mappedBy = "estudiante")
     private List<Course> curso;
      @Column(name = "fecha_inscripcion", nullable = false)
     private LocalDate fechaInscripcion;
      @Column(name = "estado_inscripcion", nullable = false)
     private String estadoInscripcion;
}
