package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "Emp_info")

public class Employee {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long id;
	
	@Column(name= "Name")
	private String Name;
	
	@Column(name= "PhoneNumb")
	private Integer PhoneNumb;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Integer getPhoneNumb() {
		return PhoneNumb;
	}
	public void setPhoneNumb(Integer phoneNumb) {
		PhoneNumb = phoneNumb;
	}

}
