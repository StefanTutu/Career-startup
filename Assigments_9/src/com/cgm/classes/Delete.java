package com.cgm.classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.cgm.connection.DBConnection;

public class Delete {

	public static void deleteStudent(int Student_ID) throws SQLException {
		Connection con = DBConnection.getConnection();
		String sql = "DELETE FROM STUDENT WHERE Student_ID = ?";
		PreparedStatement prepa = con.prepareStatement(sql);
		prepa.setInt(1, Student_ID);
		DBConnection.beginTransaction();
		int res = prepa.executeUpdate();
		if (res != 0) {
			DBConnection.commit();
		} else {
			DBConnection.rollback();
		}
		System.out.println("Deleted rows "+res);
	}

}
