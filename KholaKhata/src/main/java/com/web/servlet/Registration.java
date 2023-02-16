package com.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.dao.DaoService;
import com.web.model.User;

public class Registration extends HttpServlet 
{

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
			PrintWriter out=response.getWriter();
			try
			{
				String name=request.getParameter("name");
				String password=request.getParameter("password");
				Random random=new Random();
				int id=random.nextInt(999);
				User user=new User(id,name,password);
				String table="create table "+name+"(UserId number(5),UserName varchar2(25) primary key,password varchar2(15))";
				String sql="insert into "+name+" values(?,?,?)";
			

				Connection con=DaoService.getConnection();
				PreparedStatement pst1=con.prepareStatement(table);
				pst1.executeUpdate();
				PreparedStatement pst2=con.prepareStatement(sql);
				pst2.setInt(1, id);
				pst2.setString(2,name);
				pst2.setString(3,password);
				int status=pst2.executeUpdate();
				
				String grocery_table="create table "+name+"_grocery(item varchar2(15) primary key,quantity Float,unit varchar2(10),price Float)";
				PreparedStatement pst3=con.prepareStatement(grocery_table);
				pst3.executeUpdate();
				
				String grocery_list="create table "+name+"_history(sell_date Date,name varchar2(25),item varchar2(15),quantity Float,unit varchar2(7),ItemPrice Float,totalprice Float)";
				PreparedStatement pst4=con.prepareStatement(grocery_list);
				pst4.executeUpdate();
				
				
				RequestDispatcher dispatcher=null;
				con.close();
				if(status>0)
				{
					dispatcher=request.getRequestDispatcher("/RegistrationMessage.jsp");
					dispatcher.forward(request, response);
				}	
			}
			catch (Exception e) 
			{
				// TODO: handle exception
				out.print("Exception occured"+e);
			}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}

}
