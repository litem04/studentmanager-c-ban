package com.studentmanagement;

import jakarta.persistence.*;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	private String email;
	private int age;
	public Student() {}
	
	public Student(String name, String email, int age) {
		this.email=email;
		this.name=name;
		this.age=age;
		
	}
	public Long getId() {
		return id;
		
	}
	public void setId(Long id) {
		this.id=id;
	}
	public String getName() {
		return name;
		
	}
	public void setName(String name) {
		this.name=name;
	}
	public String geteEmail() {
		return email;
	}
	public void setEmai(String email) {
		this.email=email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
}

