package com.cgm.children;

import com.cgm.parent.Person;

public class Janitor extends Person {
	
	private String classroomsResponsible = "";
	private int workShift = 1;
	
	public String getClassroomsResponsible() {
		return classroomsResponsible;
	}
	public void setClassroomsResponsible(String classroomsResponsible) {
		this.classroomsResponsible = classroomsResponsible;
	}
	public int getWorkShift() {
		return workShift;
	}
	public void setWorkShift(int workShift) {
		this.workShift = workShift;
	}
	
	@Override
	public String toString() {
		return "Janitor [classroomsResponsible=" + classroomsResponsible + ", workShift=" + workShift + ", getName()="
				+ getName() + ", getSurname()=" + getSurname() + ", getAge()=" + getAge() + "]";
	}
	@Override
	public String DoActivity() {
	System.out.println("Do some work ");
	return "Work";
	}
	@Override
	public int payment() {
		System.out.println("Payment for janitor");
		return 0;
	}

	
	

}
