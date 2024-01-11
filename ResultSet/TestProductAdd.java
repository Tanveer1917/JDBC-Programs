package com.ResultSet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class TestProductAdd {
	
	static boolean addProduct (Product product )
	{
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/CSJ34DB", "root", "admin");
		
		String insertQuery="insert into product_name values(?,?,?)";
		PreparedStatement ps=con.prepareStatement(insertQuery);
		
		ps.setLong(1,product.getProductid());
		ps.setString(2,product.getProductName());
		ps.setDouble(3,product.getProductprice());
		
		int status=ps.executeUpdate();
		
		if(status>0)
		{
			System.out.println("Data inseerted successfully");
		}
		else
		{
			System.out.println("Data Not Inserted");
		}
	}
		catch (Exception e) {
			System.out.println(e);
		}
		return false;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter product id");
		long id=sc.nextInt();
		
		System.out.println("enter product Name");
		String pname = sc.next();
		
		System.out.println("enter product price ");
		double price  = sc.nextDouble();
		
		Product pObj=new Product(id,pname,price);
		
		boolean res= addProduct (pObj);
		
		if(res)
		{
			System.out.println("inserted sucessfully...");
		}
		else
		{
			System.out.println("Not inserted ...");
		}	
} 
}

	


