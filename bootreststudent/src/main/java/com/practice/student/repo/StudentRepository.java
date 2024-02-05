package com.practice.student.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.practice.student.entities.Student;

@Component
public interface StudentRepository extends CrudRepository<Student, Integer>
{
   public Student getStudentById(int id);
}
