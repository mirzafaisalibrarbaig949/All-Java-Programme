package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;


import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstProgram implements Servlet
{
ServletConfig conf;
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("Create Object ............");
		this.conf=config;
	}
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Service... ........111....");
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("Servlet running");
		out.println("  Today: "+new Date().toString());
		
		out.println(getServletInfo());
		out.println(getServletConfig());
		
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Destroy............");
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return this.conf;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "My first Servlet progarmme";
	}



}
