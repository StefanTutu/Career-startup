package com.cgm.main;

import java.util.Random;

import com.cgm.children.Janitor;
import com.cgm.children.Profesor;
import com.cgm.children.SecurityGuard;
import com.cgm.children.Student;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student();
		SecurityGuard securityGuard = new SecurityGuard();
		Profesor profesor = new Profesor();
		Janitor janitor = new Janitor();
		
		System.out.println(student.DoActivity());
		System.out.println(profesor.payment());
		
		Random r = new Random();
		
		for(int i =1; i<10;i++) 
		{
			student.setAge(r.nextInt(5)+18);
			student.setCourses("Math");
			student.setGrade(r.nextInt(5)+5);
			student.setName("Name "+i);
			student.setSurname("Surname "+i);
			student.setSerialNumber("18956PM1652189"+i);
			System.out.println("Student: " + student.toString());
		}
		
		for(int i =10; i<20;i++) 
		{
			securityGuard.setAge(r.nextInt(5)+25);
			securityGuard.setAllowedPortGun(r.nextBoolean());
			securityGuard.setName("Name "+i);
			securityGuard.setRound("Night");
			securityGuard.setSurname("Surname "+i);
			securityGuard.setWorkHours(r.nextInt(8)+5);
			System.out.println("Security Guard " + securityGuard.toString());
		}
		
		for(int i =20; i<30;i++) 
		{
			profesor.setAge(r.nextInt(6)+30);
			profesor.setDomain("Math");
			profesor.setName("Name "+i);
			profesor.setSurname("Surname "+i);
			profesor.setTitle("dr. conf.");
			System.out.println("Profesor "+ profesor.toString());
		}
		for(int i =30; i<40;i++) 
		{
			janitor.setAge(r.nextInt(7)+30);
			janitor.setClassroomsResponsible("B3"+i);
			janitor.setName("Name "+i);
			janitor.setSurname("Surname "+i);
			janitor.setWorkShift(r.nextInt(2)+1);
			System.out.println("Janitor "+ janitor.toString());
		}
		
	}

}
