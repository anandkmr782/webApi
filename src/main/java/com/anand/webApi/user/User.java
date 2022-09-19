package com.anand.webApi.user;

import java.time.LocalDate;

import javax.validation.constraints.Size;

public class User {
	
	public Integer id;
	@Size(min=2)
	public String name;
	public LocalDate birthDay;
	public User(Integer id, String name, LocalDate birthDay) {
		super();
		this.id = id;
		this.name = name;
		this.birthDay = birthDay;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(LocalDate birthDay) {
		this.birthDay = birthDay;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", birthDay=" + birthDay + "]";
	}
	

}
