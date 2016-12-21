package com.example.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Exclusion extends BaseEntity {

	private static final long serialVersionUID = 1L;
	
	private String firstName;
	private String lastName;

	@OneToMany
	private List<Breach> breaches;

	public List<Breach> getBreaches() {
		return breaches;
	}
	public void setBreaches(List<Breach> breaches) {
		this.breaches = breaches;
	}
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
