package com.cgm.parent;

public abstract class Person {
	
	private String name = "";
	private String surname = "";
	private int age=0;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public abstract String DoActivity();
	
	public abstract int payment();
	
}
