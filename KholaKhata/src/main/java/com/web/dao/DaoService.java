package com.web.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DaoService
{
	public static Connection getConnection() throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/m2e2jdbcday1","root","tiger");
		return con;
//		Class.forName("oracle.jdbc.driver.OracleDriver");
//		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","jay");
//		return con;
	}
}
