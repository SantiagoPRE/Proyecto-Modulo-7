package com.devsenior.proyectom7.service;

import java.util.List;
import com.devsenior.proyectom7.model.dto.StudentRequest;
import com.devsenior.proyectom7.model.dto.StudentResponse;

public interface UniversityService {

 public List<StudentResponse> getallStudents();
 public StudentResponse getStudentById (Long id);
 public StudentResponse createStudent(StudentRequest studentResponse);
public StudentResponse updateStudent(Long id,StudentRequest studentResponse);
 public void deleteStudent(Long id);

}

