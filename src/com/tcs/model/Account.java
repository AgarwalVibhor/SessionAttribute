package com.tcs.model;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class Account {
	
	
	@NotEmpty(message = "Plese enter your first name !")
	private String firstName;
	
	@NotEmpty(message = "Please enter your last name !")
	private String lastName;
	
	@NotEmpty(message = "Please enter your address !")
	@Size(min = 10, max = 100, message = "Address must be between 10 and 10 characters !")
	private String address;
	
	@NotEmpty(message = "Please enter your email id !")
	@Email(message = "Please enter a valid email id !")
	private String email;
	
	public Account() {
		// TODO Auto-generated constructor stub
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
