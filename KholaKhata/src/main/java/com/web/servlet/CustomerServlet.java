package com.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.web.dao.DaoService;
import com.web.model.Grocery;
import com.web.model.GroceryHistory;
import com.web.model.QuantityException;


public class CustomerServlet extends HttpServlet 
{
	//Store The Grocery DataBse Value
	
	String d_items;
	Integer d_quantity;
	String d_unit;
	Float d_Price;
	
	Float total_price=0f;
	public static List<GroceryHistory> list=new ArrayList<GroceryHistory>();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		PrintWriter out=response.getWriter();
		RequestDispatcher dispatcher=null;
		try
		{
			HttpSession session=request.getSession(false);
			String dname=(String)session.getAttribute("name");
			
			DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			Date d = new Date();
			String str_date=dateFormat.format(d);
			
			
			
			
			
			//str_date,name,item,quantity,unit
			String name=request.getParameter("fname");
			String item=request.getParameter("item");
			item=item.toUpperCase();
			float quantity=Float.parseFloat(request.getParameter("quantity"));
			String unit=request.getParameter("select");
			String option=request.getParameter("option");
			
			Date date=dateFormat.parse(str_date);
			
			
			Connection con=DaoService.getConnection();
			String sql1="select * from "+dname+"_grocery where item=?";

			String sql2="insert into "+dname+"_history values(?,?,?,?,?,?,?)";
			PreparedStatement pst2=con.prepareStatement(sql2);


			PreparedStatement pst1=con.prepareStatement(sql1);
			pst1.setString(1,item);
			ResultSet rs=pst1.executeQuery();
			
			
			
			if(rs!=null && rs.next())
			{
					d_items=rs.getString(1);
					d_quantity=rs.getInt(2);
					d_unit=rs.getString(3);
					d_Price=rs.getFloat(4);
					

					if(unit.equalsIgnoreCase("gm") || unit.equalsIgnoreCase("ml"))
					{
							double quant=(double)quantity/1000;
						
							if(quant > d_quantity)
							{
								try
								{
									throw new QuantityException("Entered Quantity"+quantity+" is greate than Available Quantity i.e "+d_quantity);
							
								}
								catch(Exception e)
								{
								
									out.print(e.getMessage());
								
								}
							
							}
						
							else
							{
								total_price=(float) (quant*d_Price);
								list.add(new GroceryHistory(date,name,item,quantity,unit,d_Price,total_price));
								
								pst2.setString(1,str_date);
								pst2.setString(2,name);
								pst2.setString(3,item);
								pst2.setFloat(4,quantity);
								pst2.setString(5,unit);
								pst2.setFloat(6,d_Price);
								pst2.setFloat(7,total_price);
								
								pst2.executeUpdate();

								double update_quant=(double) (d_quantity-quant);
								String sql3="update "+dname+"_grocery set quantity="+update_quant+" where item=?";
								PreparedStatement pst3=con.prepareStatement(sql3);
								pst3.setString(1,item);
								pst3.executeUpdate();
								
								if(option.equalsIgnoreCase("yes"))
								{
								
									dispatcher=request.getRequestDispatcher("/Customer.jsp");
									dispatcher.include(request, response);
								}
								else
								{
									dispatcher=request.getRequestDispatcher("/CustomerList.jsp");
									HttpSession s1=request.getSession(true);
									s1.setAttribute("list",list);
									request.setAttribute("list",list);
									dispatcher.include(request, response);
								}
							}
					
					
					}
					
					else
					{
						if(quantity > d_quantity)
						{
							try
							{
								throw new QuantityException("Entered Quantity"+quantity+" is greate than Available Quantity i.e "+d_quantity);
							
							}
							catch(Exception e)
							{
								
								out.print(e.getMessage());
								
							}
							
						}
						
						else
						{
							
							total_price=quantity*d_Price;
							list.add(new GroceryHistory(date,name,item,quantity,unit,d_Price,total_price));
							
							pst2.setString(1,str_date);
							pst2.setString(2,name);
							pst2.setString(3,item);
							pst2.setFloat(4,quantity);
							pst2.setString(5,unit);
							pst2.setFloat(6,d_Price);
							pst2.setFloat(7,total_price);
							
							pst2.executeUpdate();
							
							float update_quant=d_quantity-quantity;
							String sql3="update "+dname+"_grocery set quantity="+update_quant+" where item=?";
							PreparedStatement pst3=con.prepareStatement(sql3);
							pst3.setString(1,item);
							pst3.executeUpdate();
							if(option.equalsIgnoreCase("yes"))
							{
								
								dispatcher=request.getRequestDispatcher("/Customer.jsp");
								dispatcher.include(request, response);
							}
							else
							{
								dispatcher=request.getRequestDispatcher("/CustomerList.jsp");
								HttpSession s=request.getSession(true);
								s.setAttribute("list",list);
								request.setAttribute("list",list);
								dispatcher.include(request, response);
							}
						}
					
					
					}
			}
			else
			{
				out.print("Invalid Item Name");
			}
				
		}
		catch (Exception e) 
		{
			// TODO: handle exception
			out.print("Exception occured "+e);
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
