package com.practice.student.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Club 
{
	@Id
    private int id;
    private String clubname;
    private String clubhead;
    
    @OneToOne(mappedBy="club")
    @JsonBackReference
    private Student student;
    
	
	
	public Club()
	{
		super();
		
	}

	public Club(int id, String clubname, String clubhead, Student student) {
		super();
		this.id = id;
		this.clubname = clubname;
		this.clubhead = clubhead;
		this.student = student;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getClubname() {
		return clubname;
	}
	public void setClubname(String clubname) {
		this.clubname = clubname;
	}
	public String getClubhead() {
		return clubhead;
	}
	public void setClubhead(String clubhead) {
		this.clubhead = clubhead;
	}
	
	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Club [id=" + id + ", clubname=" + clubname + ", clubhead=" + clubhead + ", student=" + student + "]";
	}

	
    
	
    
    
}
