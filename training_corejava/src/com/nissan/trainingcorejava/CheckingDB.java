package com.nissan.trainingcorejava;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CheckingDB {
	private static CheckingDB instance = new CheckingDB();
	public static final String URL = "jdbc:mysql://localhost/testing";
	public static final String USER = "root";
	public static final String PASSWORD = "12345";
	public static final String DRIVER_CLASS = "com.mysql.jdbc.Driver"; 
	
	//private constructor
	private CheckingDB() {
		try {
			//Step 2: Load MySQL Java driver
			Class.forName(DRIVER_CLASS);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	private Connection createConnection() {

		Connection connection = null;
		try {
			//Step 3: Establish Java MySQL connection
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("Connected");
		} catch (SQLException e) {
			System.out.println("ERROR: Unable to Connect to Database.");
		}
		return connection;
	}	
	
	public static Connection getConnection() {
		return instance.createConnection();
	}

	public static void main(String[] args) {
		
		getConnection();

	}

}
