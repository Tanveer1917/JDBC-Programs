package com.Callable;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.JDBCType;
import java.sql.SQLException;
import java.util.Scanner;
import utility.JdbcUtil;

public class TestCallableDemo3 {

	public static void main(String[] args)throws SQLException {
		
	/*
	 * try with Resource
	 * If we will create objects like Connection on File or Scanner then those objects we sh
	 * should close or deinitialized by invoking by invoking close()
	 * method of connection ,file,scanner
	 * 
	 * If we declare or instanitate those objects inside the resource of block then that
	 * can be auto closeable 
	 * 
	 * 	
	 */
	
		
		try {
			Connection con=JdbcUtil.getConnection();
			Scanner sc=new Scanner(System.in);
		
			
{
				String fetchQuery="{call getALLFlights(?,?,?,?)}";
				CallableStatement csmt =con.prepareCall(fetchQuery);
				System.out.println("Enter the ifd to fetch flights");
				int id=sc.nextInt();
				csmt.setInt(1, id);
				csmt.registerOutParameter(1, JDBCType.VARCHAR);
				csmt.registerOutParameter(2, JDBCType.VARCHAR);
				csmt.registerOutParameter(3, JDBCType.INTEGER);
				csmt.registerOutParameter(4, JDBCType.DOUBLE);
				csmt.execute();
				
				String source=csmt.getString(2);
				String dest=csmt.getString(3);
				
				int nos=csmt.getInt(4);
				double price=csmt.getDouble(5);
				System.out.println(source+ " "+dest+" "+nos+" +price");
			}
			
		}catch(Exception e)
		{
			System.out.println(e);
		
			
		}
}
}
	
		
	

