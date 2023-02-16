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


public class AddProductServlet extends HttpServlet
{
	
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out=response.getWriter();
		RequestDispatcher dispatcher=null;
		try
		{
			HttpSession session=request.getSession(false);
			String name=(String)session.getAttribute("name");
			
			String item=request.getParameter("item");
			item=item.toUpperCase();
			float quantity=Float.parseFloat(request.getParameter("quantity"));
			float amount=Float.parseFloat(request.getParameter("amount"));
			String unit=request.getParameter("select");
			
			Grocery grocery=new Grocery(item,quantity,unit,amount);
			Connection con=DaoService.getConnection();
			String sql="insert into "+name+"_grocery values(?,?,?,?)";
			
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setString(1,grocery.getItem());
			pst.setFloat(2,grocery.getQuantity());
			pst.setString(3, grocery.getUnit());
			pst.setFloat(4,grocery.getPrice());
			int status=pst.executeUpdate();
			if(status>0)
			{
				dispatcher=request.getRequestDispatcher("/AddProductMessage.jsp");
				request.setAttribute("msg",item+" Saved Successfully");
				request.setAttribute("item",item);
				dispatcher.include(request, response);
			}
			else
			{
				dispatcher=request.getRequestDispatcher("/AddProductMessage.jsp");
				request.setAttribute("msg","Data Unable To Save");
				dispatcher.include(request, response);
			}

		}
		catch(Exception e) 
		{
			out.print("Exception occured "+e);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
