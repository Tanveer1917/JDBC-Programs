package RescuSetMetaData;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.JDBCType;
import java.sql.SQLException;

import utility.JdbcUtil;

public class Demo2 {

	public static void main(String[] args) throws SQLException {
		
		try(Connection con=JdbcUtil.getConnection();)
		{
			DatabaseMetaData mt= con.getMetaData();
			
			//String getDrivverName()
			String dName=mt.getDriverName();
			String dVersion=mt.getDatabaseProductVersion();
			String pname= mt.getDatabaseProductName();
			
			int size= mt.getMaxRowSize();
			
			System.out.println(dName);
			System.out.println(dVersion);
			System.out.println(pname);
			System.out.println(size);
			
			String url=mt.getURL();
			System.out.println(url);
			
		}

	}

}
