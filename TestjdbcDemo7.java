package com.JDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;



public class TestjdbcDemo7 {

	public static void main(String[] args) throws SQLException {
		Connection con = pack.JdbcUtil.getconnection();
		Statement stmt = con.createStatement();
		String loginQuery = "select cust_id,cust_email from customerreg";

		ResultSet rs = stmt.executeQuery(loginQuery);
		Scanner sc = new Scanner(System.in);

		if (rs.next()) {
			int custId = rs.getInt(1);
			System.out.println(custId + " " + "is  the valid customer");
			System.out.println("You can make an order");
			System.out.println("Enter order name");
			String orderName = sc.nextLine();
			String OrderQuery = "insert into customer_order (order_name,cust_id)values('" + orderName + "'" + ","
					+ custId + ")";
	
			stmt.executeUpdate(OrderQuery);
			System.out.println("order taken...");
		}	
			else
			{
				String query="select cust.cust.name,cust.cust_phone,cust";
				ResultSet rs3=stmt.executeQuery(query);
			}
		while(rs.next())
		{
			
			String custName=rs.getString(1);
			long ph=rs.getLong(2);
			String orderName=rs.getString(3);
			System.out.println(custName+" "+ph+" "+orderName);
		}
		String countQuery="select cust.cust_name,cust.cust_phone,custorder.order_name from Customerreg cust inner join Customer _order custOrder where cust.cust_id=csutorder.cust_id";
		ResultSet rs4=stmt.executeQuery(countQuery);
		
		if(rs4.next())
		{
			int countNumber=rs4.getInt("noc");
			System.out.println(countNumber+" "+"Customer given order");
			
			
		}
		
		}	

		// String orderQuery="insert into customer_order (order_name,cust_id)
		// values ('"+orderName+"'"+","+custId+")";
		
		//select cust.cust_name,cust.cust_phone,custorder.order_name from Customerreg cust inner join Customer _order custOrder where cust.cust_id=csutorder.cust_id;
	
}
