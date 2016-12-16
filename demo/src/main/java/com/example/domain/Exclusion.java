package com.example.domain;

import javax.persistence.Entity;

@Entity
public class Exclusion extends BaseEntity {

	private static final long serialVersionUID = 1L;
	
	private String firstName;
	private String lastName;

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}	
}
