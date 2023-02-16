package com.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.web.model.GroceryHistory;

/**
 * Servlet implementation class ClearListServlet
 */
public class ClearListServlet extends HttpServlet 
{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out=response.getWriter();
		try
		{
			RequestDispatcher dispatcher=request.getRequestDispatcher("/CustomerList.jsp");
			HttpSession session=request.getSession(false);
			List<GroceryHistory> list=(List<GroceryHistory>)session.getAttribute("list");
			list.clear();
			request.setAttribute("list",list);
			dispatcher.include(request, response);

		}
		
		catch(Exception e)
		{
			out.print("EXception Occured "+e);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
