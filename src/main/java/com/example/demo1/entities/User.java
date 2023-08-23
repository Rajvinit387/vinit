package com.example.demo1.entities;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	
	
	@Override
	public String toString() {
		return "user [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	private String name;
	private String city;
	

}
