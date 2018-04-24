package com.cgi.ecommerce.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnectionFactory {

	public static Connection giveMeaConnection()
	{
	Connection con=null;
	try
	{		
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/sarba";
		String username = "root";
		String password = "root";
		con=DriverManager.getConnection(url,username,password);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	return con;	
	}
}
