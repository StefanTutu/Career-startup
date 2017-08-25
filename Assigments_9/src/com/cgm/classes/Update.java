package com.cgm.classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.cgm.connection.DBConnection;

public class Update {

	public static void updateStudent(Students student) throws SQLException {
		String sql = "UPDATE STUDENT SET  Student_Name=?, Student_Surname=?, Student_Age=?, Stundet_Grade=?, Student_Nation=? WHERE Student_ID =?";
		Connection con = DBConnection.getConnection();
		PreparedStatement prepa = con.prepareStatement(sql);
		prepa.setString(1, student.getStudent_name());
		prepa.setString(2, student.getStudent_Surname());
		prepa.setInt(3, student.getStudent_Age());
		prepa.setInt(4, student.getStudent_Grade());
		prepa.setString(5, student.getStudent_Nation());
		prepa.setInt(6, student.getStudent_ID());
		DBConnection.beginTransaction();
		int result = prepa.executeUpdate();
		if (result != 0) {
			DBConnection.commit();
		} else {
			DBConnection.rollback();
		}
	}

}
