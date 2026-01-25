package jdbctopic.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class DBConnection 
{	
	// 1. Make credentials
	private static final String URLNAME     = "jdbc:mysql://localhost:3306/25MorningJavadb";
	private static final String DRIVERCLASS = "com.mysql.cj.jdbc.Driver";
	private static final String USERNAME    = "root";
	private static final String PASSWORD	= "root";	
	
	// 2. create method of get DB Connection
	public static Connection getDBConnection() 
	{
		Connection conn = null;
		try 
		{
			// 3. Load Driver Class
			Class.forName(DRIVERCLASS);
			
			// 4. Pass credentials into DriverManager's getConnection Method
			conn = DriverManager.getConnection(URLNAME, USERNAME, PASSWORD);
			
			// 5. validate conn object
			if (conn != null) 
			{
				System.out.println("Db connected : " + conn);
			} else 
			{
				System.out.println("Db not connected : " + conn);
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return conn;
	}
	public static void main(String[] args) 
	{
		DBConnection.getDBConnection();
	}
}