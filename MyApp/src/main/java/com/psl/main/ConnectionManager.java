package com.psl.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager
{
	static Connection conn;

	public static Connection getConnection()
	{
		try
		{
			System.out.println("Getting connectin...");
			//String url = "jdbc:mysql://10.222.78.115:3306";
			String url = "jdbc:mysql://127.0.0.1:3306";
			
			
			//String dbName ="mysql"; // here "mysql" is the name of Database.
			String dbName ="test"; 
			String uname = "root";
			String pwd = "Infy@123";

			Class.forName("com.mysql.jdbc.Driver");
			try
			{
				conn = DriverManager.getConnection(url,uname,pwd);
			}
			catch (SQLException ex)
			{
				ex.printStackTrace();
			}
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e);
		}
		return conn;
	}

}