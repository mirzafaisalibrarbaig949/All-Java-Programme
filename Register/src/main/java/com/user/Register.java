package com.user;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.xdevapi.PreparableStatement;

/**
 * Servlet implementation class Register
 */

public class Register extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
			resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		String name=req.getParameter("user_name");
		String password=req.getParameter("user_password");
		String email=req.getParameter("user_email");
		
		out.println(name);
		out.println(password);
		out.println(email);
		
		
		//Connection
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube","root","tiger");
//			Query..........
			String query="insert into user (name,password,email) values(?,?,?)";
			PreparedStatement preparableStatement=connection.prepareStatement(query);
			preparableStatement.setString(1, name);
			preparableStatement.setString(2, password);
			preparableStatement.setString(3, email);
			
			preparableStatement.executeUpdate();
			out.println("<h1>Successfully register</h1>");
			connection.close();
			preparableStatement.close();
			
		}
		catch (Exception e) {
		e.printStackTrace();
		
		out.println("<h1>Something Wrong</h1>");
		}

	}

}
