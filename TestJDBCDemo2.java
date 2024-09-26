package com.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class TestJDBCDemo2 {

	public static void main(String[] args) {
		
		Connection con1 = null;
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/CSJ34DB", "root", "admin");
 //Create Table
//			String createTableQuary = "create table CustomerReg(cust_id int primary key, cust_name varchar(40), cust_phone bigint, cust_email varchar(40))";
//			
//	java.sql.Statement stmt = con1.createStatement();
//		
//		stmt.executeUpdate(createTableQuary);
//		
//			System.out.println("Table Created");
			
			
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Customer Id ");
			int id = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter Customer Name ");
			String name= sc.nextLine();
			
			System.out.println("Enter Customer Phone Number");
			long phone = Long.parseLong(sc.nextLine());
			System.out.println("Enter Customer Em");
			String email = sc.nextLine();
			String insertQuery = "insert into customerreg values("+id+""+",'"+name+"'"+","+phone+""+",'"+email+"')";
			
			java.sql.Statement stmt1 = con1.createStatement();
			stmt1.executeUpdate(insertQuery);
			System.out.println("Congratulaion!!!"+" "+name+" you have submitted");
			
			
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
		
	}
}