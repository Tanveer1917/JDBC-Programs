package com.JDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
//import pack.JdbcUtil;

public class TestJdbcDemo4 {

	private static final Statement JdbcUtil = null;

	public static void main(String[] args) {

		try {
			Connection con = pack.JdbcUtil.getconnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from CustomerReg");
			while (rs.next()) {
				int cid = rs.getInt(1);
				String cname = rs.getString(2);
				long ph = rs.getLong(3);
				String email = rs.getString(4);
				System.out.println(cid + " " + cname + " " + ph + " " + email);
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
