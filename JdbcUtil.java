package pack;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcUtil 
{
	public static Connection getconnection()
	{
		Connection con=null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/CSJ34DB", "root", "admin");
			System.out.println("Connection with Database Established");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return con;
	}

}
