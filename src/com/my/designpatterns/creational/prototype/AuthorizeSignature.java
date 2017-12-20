package com.my.designpatterns.creational.prototype;

public class AuthorizeSignature implements Cloneable {

	private String name;
	private String designation;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	@Override
	public String toString() {
		return "[AuthorizedSingature: Name - " + getName() + ", Designation - " + getDesignation() + "]";
	}
}
