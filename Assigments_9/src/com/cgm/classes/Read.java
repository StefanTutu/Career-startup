package com.cgm.classes;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.cgm.connection.DBConnection;

public class Read {
	
	public static void readFromDB() {
		try {
			PreparedStatement ps = DBConnection.getConnection().prepareStatement("SELECT * FROM student");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				System.out.print(rs.getString("Student_ID")+" ");
				System.out.print(rs.getString("Student_Name")+" ");
				System.out.print(rs.getString("Student_surname")+" ");
				System.out.print(rs.getString("Student_Age")+" ");
				System.out.print(rs.getString("Stundet_Grade")+" ");
				System.out.print(rs.getString("Student_Nation")+" ");
				System.out.println();
			}
			rs.close();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	

}
