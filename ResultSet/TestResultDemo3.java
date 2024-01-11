package com.ResultSet;

import java.sql.ResultSet;

public class TestResultDemo3 {

	public static void main(String[] args) {
		
		ResultSet rs= ps.excuteQuery();
		while(rs.next())
		{
			long flightId=rs.getLong(1);
			long flightName=rs.getLong(flightName);
			String flightSource=rs.getString(3);
			String destination=rs.getString(4);
			Date f
			
		}
	}

}
