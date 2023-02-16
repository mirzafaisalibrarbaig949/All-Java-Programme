package com.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.web.dao.DaoService;


public class LoginValidation extends HttpServlet
{
	
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out=response.getWriter();
		RequestDispatcher dispatcher=null;

		try
		{
			String name=request.getParameter("name");
			String password=request.getParameter("password");
			Connection con=DaoService.getConnection();
			String sql="select * from "+name+" where UserName=?";
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setString(1,name);
			ResultSet rs=pst.executeQuery();
			if(rs!=null && rs.next())
			{
				if(password.equals(rs.getString("password")))
				{
					HttpSession session=request.getSession(true);
					session.setAttribute("name",name);
					dispatcher=request.getRequestDispatcher("/Grocery.jsp");
					dispatcher.include(request, response);
					
				}
				else
				{
					dispatcher=request.getRequestDispatcher("/Login.jsp");
					request.setAttribute("msg2"," Invalid Password");
					dispatcher.include(request, response);
				}
			}
			else
			{
				dispatcher=request.getRequestDispatcher("/Login.jsp");
				request.setAttribute("msg"," Invalid UserName or Password");
				dispatcher.include(request, response);
			}
			pst.executeUpdate();
			con.close();
		}
		catch(Exception e)
		{
			dispatcher=request.getRequestDispatcher("/Login.jsp");
			request.setAttribute("msg"," Invalid UserName or Password");
			dispatcher.include(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}

}
