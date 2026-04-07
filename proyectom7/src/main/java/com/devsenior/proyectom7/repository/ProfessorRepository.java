package com.devsenior.proyectom7.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsenior.proyectom7.model.entity.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {

}
