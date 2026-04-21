package com.devsenior.proyectom7.model.dto;

import java.util.List;

import com.devsenior.proyectom7.model.entity.Enrollment;
import com.devsenior.proyectom7.model.entity.Professor;

public record CourseResponse(
    Long codigoCurso,
    String nombre,
    String descripcion,
    Integer capacidad,
    Professor professor,
    List<Enrollment> inscripciones
) {

}
