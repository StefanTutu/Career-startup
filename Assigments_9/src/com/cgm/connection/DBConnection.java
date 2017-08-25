package com.cgm.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DBConnection {
	
	private static ThreadLocal<Connection> connection = new ThreadLocal<>();
	
	public static Connection getConnection() {
		if (connection.get() == null) {
			Properties props = getPorperties();
			try {
				Class.forName(props.getProperty("Driver"));
				connection.set( DriverManager.getConnection(props.getProperty("Url"), props.getProperty("User"),
						props.getProperty("Password")));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return connection.get();
	}

	private static Properties getPorperties() {
		Properties props = new Properties();
		props.put("Driver", "org.postgresql.Driver");
		props.put("Url", "jdbc:postgresql://localhost:5433/student");
		props.put("User", "postgres");
		props.put("Password", "parola");
		return props;
	}
	
	public static void beginTransaction(){ 
		Connection con = DBConnection.getConnection();
        if(con!=null){ 
            try { 
                con.setAutoCommit(false); 
            } catch (SQLException ex) { 
                ex.printStackTrace(); 
            } 
        } 
    } 
	
	public static void commit(){ 
		Connection con = DBConnection.getConnection();
		if(con!=null){ 
            try { 
                con.commit(); 
            } catch (SQLException ex) { 
                ex.printStackTrace(); 
            } 
        } 
    } 
	
	  public static void rollback(){ 
		  Connection con = DBConnection.getConnection();  
		  if(con!=null){ 
	            try { 
	                con.rollback(); 
	            } catch (SQLException ex) { 
	                ex.printStackTrace(); 
	            } 
	        } 
	    } 
	  

}
