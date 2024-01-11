package com.Callable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.JDBCType;


import java.sql.CallableStatement;

import utility.JdbcUtil;

public class TestDemo1 {

	public static void main(String[] args) {
		
		try {
		    Connection con=JdbcUtil.getConnection();
			
			
			//creating the object for callable
			CallableStatement csmt= con.prepareCall("{call addNumbers(?,?,?)}");
					
					//setting the value with In parameter
					csmt.setInt(1, 100);
					csmt.setInt(2, 700);
					
					//registering with OUt parameter
					csmt.registerOutParameter(3,JDBCType.INTEGER);
					csmt.execute();
					
					int result=csmt.getInt(3);
					System.out.println("The addition of numbers"+" "+result);
			
			
		}catch(Exception e) {
		System.out.println(e);

	}
	}
}
