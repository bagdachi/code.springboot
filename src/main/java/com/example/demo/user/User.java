package com.example.demo.user;

import java.time.LocalDate;

public class User {
	private Long id;
	private String name;
	private String mail;
	private int age;
	private LocalDate dob;
	public User(Long id, String name, String mail, int age, LocalDate dob) {
		super();
		this.id = id;
		this.name = name;
		this.mail = mail;
		this.age = age;
		this.dob = dob;
	}
	public User(String name, String mail, int age, LocalDate dob) {
		super();
		this.name = name;
		this.mail = mail;
		this.age = age;
		this.dob = dob;
	}
	public User() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", mail=" + mail + ", age=" + age + ", dob=" + dob + "]";
	}
	
	
}
