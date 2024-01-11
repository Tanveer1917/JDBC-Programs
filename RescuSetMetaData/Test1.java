package RescuSetMetaData;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

import utility.JdbcUtil;

public class Test1 {

	public static void main(String[] args) {
		
		try (Connection con=JdbcUtil.getConnection();
				{
		{
			PreparedStatement ps= con.prepareStatement("select * from Flight)";
					ResultSet rs=ps.executeQuery();
					ResultSetMetaData rsmd=rs.getMetaData();
					System.out.println(rsmd.getColumnCount());
					System.out.println(rsmd.getColumnCount(2));
					System.out.println(rsmd.getTableName(1));
			        System.out.println(rsmd.getColumnTypeName(3));
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	}

}
