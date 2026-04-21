package com.devsenior.proyectom7.model.dto;

import java.util.List;

public record ProfessorResponse(
    Long numeroDeProfesor,
     String nombre,
     String departamento,
    String correo,
     List<CourseResponse> cursos
) {

}
