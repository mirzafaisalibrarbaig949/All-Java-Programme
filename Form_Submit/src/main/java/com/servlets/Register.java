package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Register extends HttpServlet {

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<h1>welcj................</h1>");
		String ename = req.getParameter("ename");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		String confirm_password = req.getParameter("confirm_password");
		String address = req.getParameter("address");
		String course = req.getParameter("course");
		String gender = req.getParameter("gender");
		System.out.println("Start.............");

		String condition = req.getParameter("condition");
		if (condition != null) {
			if (condition.equals("checked")) {
				out.println("<h1>Name :  " + ename + "<h1>");
				out.println("<h1>Email :  " + email + "<h1>");
				out.println("<h1>Password :  " + password + "<h1>");
				out.println("<h1>ConfirmPassword :  " + confirm_password + "<h1>");
				out.println("<h1>Address :  " + address + "<h1>");
				out.println("<h1>Course :  " + course + "<h1>");
				out.println("<h1>Gender :  " + gender + "<h1>");
				System.out.println("proceing...........");
				
				//success.....
				RequestDispatcher rd  = req.getRequestDispatcher("Success");
				rd.forward(req, resp);

			} else {
				out.println("<h1>You not accepted term and condition</h1>");

			}
		} 
		else {
			out.println("<h1>You not accepted term and condition</h1>");

			//include method index.html
			RequestDispatcher rd1  = req.getRequestDispatcher("index.html");
			
			rd1.include(req, resp);
		}
		
	}

}