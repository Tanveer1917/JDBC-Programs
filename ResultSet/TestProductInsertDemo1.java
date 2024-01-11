package com.ResultSet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


class Product
{
	private long productid;
	private String  productName;
	private double productprice;
	
	public Product(long productid, String productName, double productprice) {
		super();
		this.productid = productid;
		this.productName = productName;
		this.productprice = productprice;
	}

	public long getProductid() {
		return productid;
	}

	public String getProductName() {
		return productName;
	}

	public double getProductprice() {
		return productprice;
	}

	public void delete(long pid1) {
		// TODO Auto-generated method stub
		
	}
	
	
}


public class TestProductInsertDemo1 {

	public static void main(String[] args) 
	{
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/CSJ34DB", "root", "admin");
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter product id");
		long id=sc.nextInt();
		
		System.out.println("enter product Name");
		String pname = sc.next();
		
		System.out.println("enter product price ");
		double price  = sc.nextDouble();
		
		
		Product pObj=new Product(id,pname,price);
		
		String insertQuery="insert into product_name values(?,?,?)";
		PreparedStatement ps=con.prepareStatement(insertQuery);
		
		ps.setLong(1,pObj.getProductid());
		ps.setString(2,pObj.getProductName());
		ps.setDouble(3,pObj.getProductprice());
		
		int status=ps.executeUpdate();
		
		if(status>0)
		{
			System.out.println("Data inseerted successfully");
		}
		else
		{
			System.out.println("Data Not Inserted");
		}
		
} catch (Exception e) {
		System.out.println(e);
	}
}

}
