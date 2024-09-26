package com.Transaction;

import java.util.Properties;
import java.io.FileReader;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Demo1 {

	public static void main(String[] args) throws SQLException {
		Connection con=null;
		try {

			FileReader reader = new FileReader("./src/jdbc.properties");
			Properties p = new Properties();
			p.load(reader);

			// String getpropertty(String key)
			String driverName = p.getProperty("driver");
			String url = p.getProperty("url");
			String un = p.getProperty("user");
			String pw = p.getProperty("password");
			// System.out.println(driverName+" "+url+" "+pw);

			Class.forName("com.mysql.cj.jdbc.Driver");
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/CSJ34DB", "root", "admin");
			System.out.println("Connection Established");
			con.setAutoCommit(false);
			String insertdataQuery = "insert into product_name values(?,?,?)";

			PreparedStatement ps = con.prepareStatement(insertdataQuery);
			ps.setLong(1, 1463);
			ps.setString(2, "mobile");
			ps.setDouble(3, 83000);
			int status = ps.executeUpdate();

			PreparedStatement ps2 = con.prepareStatement("delete from product_name where p_id=12s");
			ps2.execute();
			con.commit();

			/*
			 * load(Reader) void load(InutStreamReader)
			 */

		} catch (Exception e) {
			System.out.println(e);
			try {
				con.rollback();
			}catch(SQLException e1)
			{
				e1.printStackTrace();
			}
			
		finally {
			con.close();
		}

	}

	}
}

