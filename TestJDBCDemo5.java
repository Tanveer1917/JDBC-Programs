package com.JDBC;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import pack.JdbcUtil;

import java.sql.Connection;

public class TestJDBCDemo5 {

	public static void main(String[] args) {
		Connection con = null;
		try
		{
			con=pack.JdbcUtil.getconnection();
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("Select *from customerreg");
			
			/*
			 * rs.next();int cid.getInt(1);System.out.println(cid);
			 * 
			 */
			
			while(rs.next())
			{
				int cid=rs.getInt(1);
				String Cname=rs.getString(2);
				long ph=rs.getLong(3);
				String emailString=rs.getString(4);
				System.out.println(cid+" "+Cname+" "+ph+" "+emailString+" ");
                Scanner sc=new Scanner(System.in);
                
                System.out.println("Enter the customer id search");
                int id=sc.nextInt();
                ResultSet rs1=stmt.executeQuery("Select * from customerreg where  cust_id="+id+"");
                
                if(rs1.next())
                {
                	System.out.println(rs1.getString("cust_name")+" "+rs1.getLong("cust_phone")+" "+rs1.getString("cust_email"));
                }
                
                System.out.println("Enter id=");
                
			}

	}
		catch (Exception e) {
			System.out.println(e);
		}

}
}
