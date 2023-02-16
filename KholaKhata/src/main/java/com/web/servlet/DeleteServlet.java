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
import com.web.model.Grocery;

public class DeleteServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		RequestDispatcher dispatcher=null;
		try
		{
			HttpSession session=request.getSession(false);
			String name=(String)session.getAttribute("name");
			
			String item=request.getParameter("item");
			item=item.toUpperCase();
			
			
			Connection con=DaoService.getConnection();
			String sql1="delete from "+name+"_grocery where item=?";

			PreparedStatement pst1=con.prepareStatement(sql1);

			pst1.setString(1,item);

			int status1=pst1.executeUpdate();

			if(status1>0)
			{
				dispatcher=request.getRequestDispatcher("/DeleteProductMessage.jsp");
				request.setAttribute("msg",item+" Deleted Successfully");
				request.setAttribute("item",item);
				dispatcher.include(request, response);
			}
			else
			{
				dispatcher=request.getRequestDispatcher("/DeleteProductMessage.jsp");
				request.setAttribute("msg","Data Unable To Delete");
				dispatcher.include(request, response);
			}
		}
		catch(Exception e) 
		{
			out.print("Exception occured "+e);
		}

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
