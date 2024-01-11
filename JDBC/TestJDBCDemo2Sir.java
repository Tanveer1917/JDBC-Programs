package com.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TestJDBCDemo2Sir {

	public static void main(String[] args) {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/CSJ34DB", "root", "admin");
//creating table;
//String createTableQuery="create table CustomerReg(cust_id int primary key,cust_name varchar(40),cust_phone bigint, cust_email varchar(40))";
			Scanner sc = new Scanner(System.in);
			System.out.println("enter customer id");
			int cid = Integer.parseInt(sc.nextLine());
			System.out.println("enter customer name");
			String cname = sc.nextLine();
			System.out.println("enter customer phone number");
			long ph = Long.parseLong(sc.nextLine());
			System.out.println("enter customer email id");
			String email = sc.nextLine();
			String insertQuery = "insert into customerreg values(" + cid + "" + ",'" + cname + "'" + "," + ph + ""
					+ ",'" + email + "')";

			Statement stmt = con.createStatement();
			stmt.executeUpdate(insertQuery);
			System.out.println("congratulation!!!" + " " + cname + "" + "you have registered");
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}

	}

}
