package com.cgm.children;

import com.cgm.parent.Person;

public class Student extends Person {

	private double grade = 0.00;
	private String courses = "";
	private String serialNumber = "";
	
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	public String getCourses() {
		return courses;
	}
	public void setCourses(String courses) {
		this.courses = courses;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	@Override
	public String toString() {
		return "Student [grade=" + grade + ", courses=" + courses + ", serialNumber=" + serialNumber + ", getName()="
				+ getName() + ", getSurname()=" + getSurname() + ", getAge()=" + getAge() + "]";
	}
	@Override
	public String DoActivity() {
		System.out.println("Students");
		return "studies hours";
	}
	@Override
	public int payment() {
		System.out.println("Value of scholarship");
		return 400;
	}
	
}
