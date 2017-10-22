package edu.asu.az4children.beans;

import java.util.Calendar;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Kid {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int kidId;
	private String firstName;
	private String lastName;
	private Calendar dateOfBirth;
	private String gender;
	private Parent parent;
	public int getKidId() {
		return kidId;
	}
	public void setKidId(int kidId) {
		this.kidId = kidId;
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
	public Calendar getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Calendar dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Parent getParent() {
		return parent;
	}
	public void setParent(Parent parent) {
		this.parent = parent;
	}	
}
