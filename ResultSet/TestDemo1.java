package com.ResultSet;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.x.protobuf.MysqlxPrepare.Execute;

import pack.JdbcUtil;

public class TestDemo1 {

	public static void main(String[] args) throws SQLException {
		
		
		Connection con=JdbcUtil.getconnection();
		Statement st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 0);
		ResultSet rs = st.executeQuery("select * from customerreg");
		 
		rs.absolute(2);
		rs.updateLong("cust_phone",7066730270L);
		
	    rs.updateRow();
	    System.out.println(rs.getLong(3));
		rs.last();
		System.out.println(rs.getString(4));
		rs.first();
		System.out.println(rs.getLong(3));
		rs.relative(1);
		System.out.println(rs.getInt(1));

	}

}
