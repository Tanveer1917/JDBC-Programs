package com.ResultSet;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

import pack.JdbcUtil;

public class TestDemo2 {

	public static void main(String[] args) throws SQLException, InterruptedException{
		
		Connection con=JdbcUtil.getconnection();
		java.sql.Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
		ResultSet rs= stmt.executeQuery("Select * from customerreg");
		int countRow=1;
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+ " ");
			if(countRow==2)
				Thread.sleep(3000);
			countRow++;
		}
		
	}

}
