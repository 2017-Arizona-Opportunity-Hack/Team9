package edu.asu.az4children.beans;

public class Parent {
	private int parentId;
	private String pfirstName;
	private String plastName;
	private String emailId;
	private Kid kid;
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public int getParentId() {
		return parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	public String getPfirstName() {
		return pfirstName;
	}
	public void setPfirstName(String pfirstName) {
		this.pfirstName = pfirstName;
	}
	public String getPlastName() {
		return plastName;
	}
	public void setPlastName(String plastName) {
		this.plastName = plastName;
	}
	public Kid getKid() {
		return kid;
	}
	public void setKid(Kid kid) {
		this.kid = kid;
	}	
}
