package com.devsenior.proyectom7.model.dto;

import java.util.List;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;



public record ProfessorRequest(
    @NotEmpty
    Long numeroDeProfesor,
    @NotBlank
    String nombre,
    @NotBlank
    String departamento,
    @NotBlank
    String correo,
     List<CourseRequest> cursos
) {}

