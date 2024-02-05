package com.practice.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.practice.student.entities.Student;
import com.practice.student.repo.StudentRepository;

@Component
public class StudentService 
{
   @Autowired
   public StudentRepository studentRepository;
   
   public Student addStudent(Student stu)
   {
	   Student save = studentRepository.save(stu);
	   return save;
   }
   
   public Student  getStudentById(int id)
   {
	   Student byId = studentRepository.getStudentById(id);
	   return byId;
   }
   
   public List<Student> getAllStudent()
   {
	   List<Student> all = (List<Student>) studentRepository.findAll();
	   return all;
   }
   
   public String delByID(int id)
   {
	   studentRepository.deleteById(id);
	   return "Student Deleted";
   }
   
   public String updateStu(Student stud, int id)
   {
	  stud.setId(id);
	  studentRepository.save(stud);
	  return "UPDATED";
   }
   
   
}
