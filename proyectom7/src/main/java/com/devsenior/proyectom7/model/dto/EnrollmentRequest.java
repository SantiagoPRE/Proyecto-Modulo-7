package com.devsenior.proyectom7.model.dto;

import java.time.LocalDate;

import com.devsenior.proyectom7.model.entity.Course;
import com.devsenior.proyectom7.model.entity.Student;

import jakarta.validation.constraints.NotEmpty;


public record EnrollmentRequest(
    @NotEmpty
    Student estudiante,
    @NotEmpty
    Course curso,
    LocalDate fechaInscripcion,
    String estadoInscripcion
) {

}
