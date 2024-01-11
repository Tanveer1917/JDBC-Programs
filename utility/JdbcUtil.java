package utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcUtil {

	public static Connection getConnection()
	{
		Connection con=null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/CSJ34DB","root","admin");
		
			System.out.println("connection with DB estabilished");
		}catch(Exception e)
		{
			System.out.println(e);
		}
		return con;
	}
	
	
	
	
}