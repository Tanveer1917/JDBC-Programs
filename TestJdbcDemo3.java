package com.JDBC;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;
import pack.*;

public class TestJdbcDemo3 {

	private static final Statement JdbcUtil = null;

	public static void main(String[] args) {

		try {
			Scanner sc = new Scanner(System.in);
			/*
			 * System.out.println("enter customer id"); int id=sc.nextInt();
			 * System.out.println("enter new phone number"); long ph=sc.nextLong(); String
			 * updateQuery= "update customerreg set cust_phone="+ph+" where cust_id="+id+"";
			 */
			Connection con = pack.JdbcUtil.getconnection();
			/*
			 * Statement stmt= con.createStatement(); int
			 * status=stmt.executeUpdate(updateQuery); if(status>0) {
			 * System.out.println("data updated...."); }else {
			 * System.out.println("not able to update..."); }
			 */
			System.out.println("enter the to delete");
			int deleteId = sc.nextInt();

			String deleteQyery = "delete from customerreg where cust_id=" + deleteId + "";
			Statement stmt1 = con.createStatement();
			int deleteStatus = stmt1.executeUpdate(deleteQyery);

			if (deleteStatus > 0) {
				System.out.println("deleted");
			} else {
				System.out.println("not deleted");
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
