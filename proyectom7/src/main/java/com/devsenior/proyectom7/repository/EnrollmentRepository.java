package com.devsenior.proyectom7.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsenior.proyectom7.model.entity.Enrollment;

public interface EnrollmentRepository extends JpaRepository<Enrollment, Long> {

}
