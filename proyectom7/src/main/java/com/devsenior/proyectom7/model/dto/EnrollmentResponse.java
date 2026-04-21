package com.devsenior.proyectom7.model.dto;

import java.time.LocalDate;
import com.devsenior.proyectom7.model.entity.Course;
import com.devsenior.proyectom7.model.entity.Student;

public record EnrollmentResponse(
    Long idIncripcion,
    Student estudiante,
    Course curso,
    LocalDate fechaInscripcion,
    String estadoInscripcion
) {

}
