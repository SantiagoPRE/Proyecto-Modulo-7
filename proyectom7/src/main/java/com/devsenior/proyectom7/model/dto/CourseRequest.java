package com.devsenior.proyectom7.model.dto;

import java.util.List;

import com.devsenior.proyectom7.model.entity.Enrollment;
import com.devsenior.proyectom7.model.entity.Professor;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;


public record CourseRequest(
    @JsonProperty("codigo_curso")
    @NotEmpty
    Long codigoCurso,
    @NotBlank
    String nombre,
    @NotBlank
    String descripcion,
    @NotEmpty
    Integer capacidad,
    @NotNull
    Professor professor,
    List<Enrollment> inscripciones
) {

}
