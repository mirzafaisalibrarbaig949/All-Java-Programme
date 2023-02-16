package com.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.web.dao.DaoService;
import com.web.model.Grocery;


public class ShowProductServlet extends HttpServlet
{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		RequestDispatcher dispatcher=null;
		PrintWriter out=response.getWriter();
		try
		{
			HttpSession session=request.getSession(false);
			String name=(String)session.getAttribute("name");
			Connection con=DaoService.getConnection();
			String sql="select * from "+name+"_grocery order by item";
			PreparedStatement pst=con.prepareStatement(sql);
			ResultSet rs=pst.executeQuery();
			List<Grocery> list=new ArrayList<Grocery>();
			while(rs != null && rs.next())
			{
				
				list.add(new Grocery(rs.getString(1),rs.getFloat(2),rs.getString(3),rs.getFloat(4)));
			}
			
			ServletContext ctx=request.getServletContext();
			
			ctx.setAttribute("array",list);
			dispatcher=request.getRequestDispatcher("/ShowProduct.jsp");
			dispatcher.include(request, response);
			
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
