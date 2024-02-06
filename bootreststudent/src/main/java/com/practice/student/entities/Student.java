package com.practice.student.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Student 
{
	
	@Id
    private int id;
    private String name;
    private String dept;
    @OneToOne(cascade=CascadeType.ALL)
    @JsonManagedReference
    private Club club;
    
	

	public Student(int id, String name, String dept, Club club) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.club = club;
	}



	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}




	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
    
	public Club getClub() {
		return club;
	}
	public void setClub(Club club) {
		this.club = club;
	}




	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", dept=" + dept + ", club=" + club + "]";
	}



	
	
	
    
    
    
}
