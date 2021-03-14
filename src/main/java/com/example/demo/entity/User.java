package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class User 
{
	@Id
	@GeneratedValue
	private int id;
	@NotBlank(message = "Name is missing")
	@Size(max = 10,message = "too long name")
	private String name;
	@NotBlank(message = "role is missing")
	@Size(max = 16,message = "too long role")
	private String role;
	
	public User(int id, String name, String role) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
	}
	public User() {
		super();
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
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	

}
