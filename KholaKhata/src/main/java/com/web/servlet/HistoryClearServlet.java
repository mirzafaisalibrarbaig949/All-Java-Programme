package com.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.web.dao.DaoService;

/**
 * Servlet implementation class HistoryClearServlet
 */
public class HistoryClearServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{	PrintWriter out=response.getWriter();
		try
		{
			HttpSession s=request.getSession(false);
			String name=(String)s.getAttribute("name");
			Connection con=DaoService.getConnection();
			String sql="delete from "+name+"_history";
			PreparedStatement pst=con.prepareStatement(sql);
			pst.executeUpdate();
			con.close();
			RequestDispatcher dispatcher=request.getRequestDispatcher("/HistoryServlet.jsp");
			dispatcher.forward(request, response);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			out.print(e);
		}
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
