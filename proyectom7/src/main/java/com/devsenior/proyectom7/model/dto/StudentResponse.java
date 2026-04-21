package com.devsenior.proyectom7.model.dto;

import java.util.List;


public record StudentResponse(
    
    Long numeroDeEstudiante,
   
    String nombre,
   
    String correo,
    
    List<EnrollmentResponse> inscripciones) {

}
