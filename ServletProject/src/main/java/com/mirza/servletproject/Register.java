package com.mirza.servletproject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Register extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String phoneno=req.getParameter("phoneno");
		String address=req.getParameter("address");
		String age=req.getParameter("age");
		System.out.println(name+" "+email+" "+phoneno+" "+address+" "+age);
		
		

		PrintWriter out=res.getWriter();
		out.println("<h1 >" + "Hiii.Success serverlet............" + "<h1>");
		out.println("<h1>Name :  " + name + "<h1>");
		out.println("<h1>Email :  " + email + "<h1>");
		out.println("<h1>Phone No :  " + phoneno + "<h1>");
		out.println("<h1>Address :  " + address + "<h1>");
		out.println("<h1>Age :  " + age + "<h1>");
		out.println();
		
//		out.println(name);
//		out.println(email);
//		out.println(phoneno);
//		out.println(address);
//		out.println(age);
		
		
	}

}
