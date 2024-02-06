package com.practice.student.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.practice.student.entities.Student;
import com.practice.student.service.StudentService;

@RestController
public class StudentController 
{
	@Autowired
    public StudentService studentService;
    //adding a student
    @PostMapping("/addStudent")
    public ResponseEntity<Student> addStud(@RequestBody Student stu)
    {   Student stud=null;
        try 
        {
    	stud=studentService.addStudent(stu);
    	return ResponseEntity.status(HttpStatus.ACCEPTED).body(stud);
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        	return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    @GetMapping("/getstudent/{id}")
    public ResponseEntity<Student> getStudentId(@RequestBody Student stu, @PathVariable int id)
    {    Student studentById=null;
    
    	try 
    	{
    	studentById = studentService.getStudentById(id);
    	return ResponseEntity.ok(studentById);
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    	}
    	
    }
    @GetMapping("/getAllStudent")
    public ResponseEntity<List<Student>> getAll()
    {
    	List<Student> stud=null;
    	try
    	{
    		stud=studentService.getAllStudent();
    		return ResponseEntity.ok(stud);
    		
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    	}
    }
    @DeleteMapping("/deleteStudent/{id}")
    public ResponseEntity<String> deleteBYId(@PathVariable int id)
    {
    	studentService.delByID(id);
    	return ResponseEntity.ok("DELETED");
    }
    
    @PutMapping("/updateStudent/{id}")
    public ResponseEntity<String> updateStudent(@RequestBody Student st, @PathVariable int id)
    {
    	String updateStu = studentService.updateStu(st, id);
    	return ResponseEntity.ok("updated");
    }
}
