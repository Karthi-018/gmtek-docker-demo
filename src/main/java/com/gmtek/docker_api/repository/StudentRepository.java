package com.gmtek.docker_api.repository;

import com.gmtek.docker_api.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student,String> {
}
