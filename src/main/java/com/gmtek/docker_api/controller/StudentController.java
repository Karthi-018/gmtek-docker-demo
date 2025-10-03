package com.gmtek.docker_api.controller;

import com.gmtek.docker_api.model.Student;
import com.gmtek.docker_api.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("api/gmtek")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService service;

    @PostMapping("student")
    public ResponseEntity<Student> addStudent(@RequestBody Student student)
    {
        Student s = service.addStudent(student);
        return ResponseEntity.ok(s);
    }

    @GetMapping("student/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable String id)
    {
        return ResponseEntity.ok(service.getStudentById(id));
    }

    @GetMapping("students")
    public ResponseEntity<List<Student>> getStudentsList()
    {
        return ResponseEntity.ok(service.getStudentsList());
    }



}
