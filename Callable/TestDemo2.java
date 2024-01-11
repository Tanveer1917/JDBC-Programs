package com.Callable;

import java.sql.Connection;
import java.sql.JDBCType;
import java.util.Scanner;

import java.sql.CallableStatement;

import utility.JdbcUtil;

public class TestDemo2 {

	public static void main(String[] args) {
		
		try {
			Connection con=JdbcUtil.getConnection();
			CallableStatement csmt=con.prepareCall("{call fetchflight(?,?)}");
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter the flight id to get the price");
			int id=sc.nextInt();
			
			csmt.setInt(1, id);
			csmt.registerOutParameter(2, JDBCType.DOUBLE);
			csmt.execute();
			double flightPrice=csmt.getDouble(2);
			System.out.println("the price of"+" "+id+" is"+" "+flightPrice);
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
	
	}
	}
