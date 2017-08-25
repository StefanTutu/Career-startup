package com.cgm.classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.cgm.connection.DBConnection;

public class Add {
	
	 public static int addStudent(Students student) throws Exception {
	        int Student_ID = generateStudentId() + 1;
	        String sql = "INSERT INTO student(Student_ID, Student_Name, Student_Surname, Student_Age, Stundet_Grade, Student_Nation)\r\n" + 
	        		" VALUES(?, ?, ?, ?, ?, ?)";
	        Connection con = DBConnection.getConnection();
	        PreparedStatement prepa = con.prepareStatement(sql);
	        prepa.setInt(1, student.getStudent_ID());
	    	prepa.setString(2, student.getStudent_name());
			prepa.setString(3, student.getStudent_Surname());
			prepa.setInt(4, student.getStudent_Age());
			prepa.setInt(5, student.getStudent_Grade());
			prepa.setString(6, student.getStudent_Nation());
	        DBConnection.beginTransaction();
	        int result = prepa.executeUpdate();
	        if (result != 0) {
	            DBConnection.commit();
	        } else {
	            DBConnection.rollback();
	        }
	        return Student_ID;
	    }
	 
	 private static int generateStudentId() {
	        String query = "SELECT MAX(Student_ID) from student";
	        Connection con = null;
	        Statement state = null;
	        int res = 0;
	        try {
	            con = DBConnection.getConnection();
	            state = con.createStatement();
	            res = state.executeUpdate(query);
	        } catch (SQLException ex) {
	            ex.printStackTrace();
	        }
	        return res;
	    }
}
