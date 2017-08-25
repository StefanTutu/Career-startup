package com.cgm.classes;

public class Students {

	private int Student_ID;
	private String Student_name;
	private String Student_Surname;
	private int Student_Age;
	private int Student_Grade;

	private String Student_Nation;
	
	public int getStudent_ID() {
		return Student_ID;
	}
	public void setStudent_ID(int student_ID) {
		Student_ID = student_ID;
	}
	public String getStudent_name() {
		return Student_name;
	}
	public void setStudent_name(String student_name) {
		Student_name = student_name;
	}
	public String getStudent_Surname() {
		return Student_Surname;
	}
	public void setStudent_Surname(String student_Surname) {
		Student_Surname = student_Surname;
	}
	public int getStudent_Age() {
		return Student_Age;
	}
	public void setStudent_Age(int student_Age) {
		Student_Age = student_Age;
	}
	public String getStudent_Nation() {
		return Student_Nation;
	}
	public void setStudent_Nation(String student_Nation) {
		Student_Nation = student_Nation;
	}
	public int getStudent_Grade() {
		return Student_Grade;
	}
	public void setStudent_Grade(int student_Grade) {
		Student_Grade = student_Grade;
	}
	
	public Students(int student_ID, String student_name, String student_Surname, int student_Age, int student_Grade,
			String student_Nation) {
		super();
		Student_ID = student_ID;
		Student_name = student_name;
		Student_Surname = student_Surname;
		Student_Age = student_Age;
		Student_Grade = student_Grade;
		Student_Nation = student_Nation;
	}
	@Override
	public String toString() {
		return "Students with Student_ID=" + Student_ID + ", Student_name=" + Student_name + ", Student_Surname="
				+ Student_Surname + ", Student_Age=" + Student_Age + ", Student_Grade=" + Student_Grade
				+ ", Student_Nation=" + Student_Nation + ".";
	}

	public Students() {
	    super();
	}
}
