package com.cgm.main;

import com.cgm.classes.Add;
import com.cgm.classes.Delete;
import com.cgm.classes.Read;
import com.cgm.classes.Students;
import com.cgm.classes.Update;

public class BDMain {

	public static void main(String[] args) throws Exception {

		Students student = new Students();
		student.setStudent_name("Victor");
		student.setStudent_ID(5240);
		student.setStudent_Surname("Manuel");
		student.setStudent_Grade(8);
		student.setStudent_Age(20);
		student.setStudent_Nation("Eng");

		// inserting Student object and getting the student
		Add.addStudent(student);
		//read
		Read.readFromDB();

		// displaying student data before update
		System.out.println("Before Update : " + student.toString());
		
		// updating the student object values
		student.setStudent_name("New name");
		student.setStudent_Age(25);
		student.setStudent_Grade(10);
		student.setStudent_Nation("New Nation");
		student.setStudent_Surname("New surname");
		
		// updating the modified student
		Update.updateStudent(student);
		Read.readFromDB();

		// displaying the updated data
		System.out.println("After Update : " + student.toString());
		// deleting the student
		
		Delete.deleteStudent(student.getStudent_ID());

		Read.readFromDB();
	}

}
