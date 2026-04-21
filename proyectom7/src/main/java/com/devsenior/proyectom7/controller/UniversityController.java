package com.devsenior.proyectom7.controller;

import java.io.ObjectInputStream.GetField;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsenior.proyectom7.model.dto.StudentRequest;
import com.devsenior.proyectom7.model.dto.StudentResponse;
import com.devsenior.proyectom7.service.UniversityService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/university")
public class UniversityController {

    private final UniversityService universityService;

    @GetMapping("/students")
    public List<StudentResponse> getallStudents() {
        return universityService.getallStudents();
    };

    @GetMapping("/students/{id}")
    public StudentResponse getStudentById(@PathVariable Long id) {
        return universityService.getStudentById(id);
    }

    @PostMapping("/students")
    public StudentResponse createStudent(@RequestBody StudentRequest studentResponse) {
        return universityService.createStudent(studentResponse);
    }

    @PutMapping("/students/{id}")
    public StudentResponse updateStudent(@PathVariable Long id, @RequestBody StudentRequest studentResponse) {
        return universityService.updateStudent(id, studentResponse);
    }

    @DeleteMapping("/students/{id}")
    public void deleteStudent(@PathVariable Long id) {
    }

}