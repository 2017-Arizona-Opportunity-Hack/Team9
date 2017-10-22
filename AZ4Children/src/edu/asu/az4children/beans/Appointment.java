package edu.asu.az4children.beans;

import java.util.Calendar;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

public class Appointment {

	private int appointmentId;
	private Calendar checkInTime;
	private Calendar checkOutTime;
	private int numberOfPeopleVisiting;
	private Parent parent;
	private Kid kid;
	public int getAppointmentId() {
		return appointmentId;
	}
	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}
	public Calendar getCheckInTime() {
		return checkInTime;
	}
	public void setCheckInTime(Calendar checkInTime) {
		this.checkInTime = checkInTime;
	}
	public Calendar getCheckOutTime() {
		return checkOutTime;
	}
	public void setCheckOutTime(Calendar checkOutTime) {
		this.checkOutTime = checkOutTime;
	}
	public int getNumberOfPeopleVisiting() {
		return numberOfPeopleVisiting;
	}
	public void setNumberOfPeopleVisiting(int numberOfPeopleVisiting) {
		this.numberOfPeopleVisiting = numberOfPeopleVisiting;
	}
	public Parent getParent() {
		return parent;
	}
	public void setParent(Parent parent) {
		this.parent = parent;
	}
	public Kid getKid() {
		return kid;
	}
	public void setKid(Kid kid) {
		this.kid = kid;
	}	
}
