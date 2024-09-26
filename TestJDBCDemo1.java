package com.JDBC;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.Statement;
import java.sql.Connection;

public class TestJDBCDemo1 {
	public static void main(String[] args)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {

		// step1:we have to load a driver or register a driver

		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("mysql driver Loaded");

		// step2:establish connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/CSJ34DB", "root", "admin");
		System.out.println("connection established" + con);

		// insert one record into database

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the username");
		String uname = sc.next();
		System.out.println("Enter the Password");
		String pw = sc.next();
		// Now creating object of statement

		// Statement createStatement()
		String sqlInsertQuery = "insert into UserDetails values('"+uname+"'"+",'"+pw+"')";

		Statement stmt = con.createStatement();

		// int exceutbaleodate(String SQLQuery)throws SQLException
		int status = stmt.executeUpdate(sqlInsertQuery);
		System.out.println(status + "row inserted");

	}
}
