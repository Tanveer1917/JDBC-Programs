package com.JDBC;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import pack.JdbcUtil;

public class TestJDBCDemo6 {

	public static void main(String[] args)
	{
		import java.sql.Connection;
		import java.sql.DriverManager;
		import java.sql.PreparedStatement;
		import java.sql.ResultSet;
		import java.sql.SQLException;
		import java.util.Scanner;

		public class JDBCLoginExample 
		{
		    // JDBC URL, username, and password of MySQL server
		    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/CSJ34DB","root","admin")";
		    private static final String DB_USER = "your_username";
		    private static final String DB_PASSWORD = "your_password";

		    public static void main(String[] args) {
		        try (Scanner scanner = new Scanner(System.in)) {
		            boolean loginSuccessful = false;

		            // Keep prompting for login until successful
		            while (!loginSuccessful) {
		                // Input username and password from the user
		                System.out.print("Enter username: ");
		                String username = scanner.nextLine();

		                System.out.print("Enter password: ");
		                String password = scanner.nextLine();

		                // Check if the provided username and password are valid
		                loginSuccessful = isValidLogin(username, password);

		                if (loginSuccessful) {
		                    System.out.println("Login successful!");
		                } else {
		                    System.out.println("Invalid username or password. Login failed. Try again.");
		                }
		            }
		        } catch (SQLException e) {
		        }
		    }

			private static boolean isValidLogin(String username, String password) {
				// TODO Auto-generated method stub
				return false;
			}
		        }
		       
