package com.mirza.servletproject.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import com.mirza.serverletproject.dto.Student;
import com.mirza.servletproject.dto.StudentDAO;

@WebServlet("/saveStudent")
public class StudentController extends GenericServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
 
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String address=req.getParameter("address");
		Student student=new Student();
		student.setName(name);
		student.setEmail(email);
		student.setAddress(address);
		StudentDAO dao=new StudentDAO();
		dao.saveDetails(student);
		PrintWriter out=res.getWriter();
//		if(dao.result>0) {
//			out.println("<h1 >" + "Success fully register" + "<h1>");
//		}
	}
	

}
