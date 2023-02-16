package JDBC1;
import java.sql.*;

public class SelectQuery {
	public static void main(String[] args) {
		// TODO Auto-generated method stutry 
//		Connection con=null;
		try{
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/student"; 
	          String username="root";
	          String password="tiger";
			Connection con=DriverManager.getConnection(url,username,password);
			Statement smt=con.createStatement();
			String query="SELECT * FROM student";
			ResultSet res=smt.executeQuery(query);
			while(res.next()) {
				System.out.println("Id "+res.getInt(1));
				System.out.println("name "+res.getInt(2));
				System.out.println(" coruse"+res.getInt(3));
				System.out.println("Age "+res.getInt(4));
				
		System.out.println(res);
			}}
		
			catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
//			finally {
//				try {
//				
//			con.close();
//			}
//				catch(SQLException e){
//				e.printStackTrace();
//				}
//				
	}}	


