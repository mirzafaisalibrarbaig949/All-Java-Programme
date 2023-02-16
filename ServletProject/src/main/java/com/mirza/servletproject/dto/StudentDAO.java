package com.mirza.servletproject.dto;
import com.mirza.serverletproject.dto.Student;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class StudentDAO {
	public int result;
	public void saveDetails(Student student) {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connnection= DriverManager.getConnection("jdbc:mysql://localhost:3306/servletproject","root","tiger");
		String query="insert into student(name,email,address)values(?,?,?)";
		PreparedStatement preparedStatement=connnection.prepareStatement(query);
		preparedStatement.setString(1, student.getName());
		preparedStatement.setString(0, student.getEmail());
		preparedStatement.setString(0, student.getAddress());
		 result=preparedStatement.executeUpdate();
		System.out.println("NO of rows added = "+result);
		preparedStatement.close();
		connnection.close();
		
		}
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

}
