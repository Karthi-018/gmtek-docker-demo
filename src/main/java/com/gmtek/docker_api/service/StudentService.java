package com.gmtek.docker_api.service;

import com.gmtek.docker_api.model.Student;
import com.gmtek.docker_api.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository repository;

    public Student getStudentById(String id) {

        return repository.findById(id).get();
    }

    public Student addStudent(Student student) {

        return repository.save(student);
    }

    public List<Student> getStudentsList() {

        return repository.findAll();
    }
}
