package com.rgh.users.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class user {

	@Id
	private Integer iduser;
	
	private String firstName;
	private String lastName;
	public Integer getIduser() {
		return iduser;
	}
	public void setIduser(Integer iduser) {
		this.iduser = iduser;
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
	
	public user() {
		super();
	}
	

	
	public user(Integer iduser, String firstName, String lastName) {
		super();
		this.iduser = iduser;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "user [iduser=" + iduser + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
	
	


}
