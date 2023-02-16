package com.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.web.dao.DaoService;
import com.web.model.Grocery;


public class UpdateServlet extends HttpServlet {
	
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
			Float quantity=(float) Integer.parseInt(request.getParameter("quantity"));
			float amount=Float.parseFloat(request.getParameter("amount"));
			String unit=request.getParameter("select");
			
			Grocery grocery=new Grocery(item,quantity,unit,amount);
			Connection con=DaoService.getConnection();
			String sql1="update "+name+"_grocery set quantity="+quantity+" where item=?";
			String sql2="update "+name+"_grocery set price="+amount+" where item=?";

			PreparedStatement pst1=con.prepareStatement(sql1);
			PreparedStatement pst2=con.prepareStatement(sql2);

			pst1.setString(1,grocery.getItem());
			pst2.setString(1,grocery.getItem());

			int status1=pst1.executeUpdate();

			int status2=pst2.executeUpdate();
			if(status1>0 && status2>0)
			{
				dispatcher=request.getRequestDispatcher("/UpdateProductMessage.jsp");
				request.setAttribute("msg",item+" Updated Successfully");
				request.setAttribute("item",item);
				dispatcher.include(request, response);
			}
			else
			{
				dispatcher=request.getRequestDispatcher("/UpdateProductMessage.jsp");
				request.setAttribute("msg","Data Unable To Update");
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
