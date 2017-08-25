package com.cgm.children;

import com.cgm.parent.Person;

public class Profesor extends Person {
	
	private String title = "";
	private String domain = "";
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	@Override
	public String toString() {
		return "Profesor [title=" + title + ", domain=" + domain + ", getName()=" + getName() + ", getSurname()="
				+ getSurname() + ", getAge()=" + getAge() + "]";
	}
	@Override
	public String DoActivity() {
		System.out.println("Work specified for teachers");
		return "Class hour";
	}
	@Override
	public int payment() {
		System.out.println("Payment for profesor !");
		return 2000;
	}
	
}
