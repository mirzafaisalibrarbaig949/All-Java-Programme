package data;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class UserData extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("Generic Serverlet.....111........");
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		System.out.println(name+ " "+email);
		
	}
	
	
	

}

