package com.mirza.StudentRegister;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class StudentRegister extends GenericServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String phoneno=req.getParameter("phone");
		String age=req.getParameter("age");
		String branch=req.getParameter("branch");
		String gender=req.getParameter("gender");
		String address=req.getParameter("address");
		
		
		System.out.println(name+" "+email+" "+phoneno+" "+age+" "+branch+" "+gender+" "+address);
		PrintWriter out=res.getWriter();
//		JDBC Connection 
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
		        
	          Connection connnection= DriverManager.getConnection("jdbc:mysql://localhost:3306/studentregistration","root","tiger"); //Connection establish
			
			
			
			Statement statement=connnection.createStatement();
			String query="INSERT INTO Student(sname,email,phoneno,age,branch,gender,address) VALUES ('"+ name +"','"+ email +"','"+ phoneno +"','"+ age +"','"+ branch +"','"+ gender +"','"+ address +"')";
						
			int result=statement.executeUpdate(query);
			
			System.out.println(result+"no. of rows inserted");
			
			if(result>0)
				out.println("<h1 >" + "You Register Successfully" + "<h1>");
			
			connnection.close();
		} catch (SQLException |ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}
