package JDBCSecond;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDelete {
	public static void main(String[] args) {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/firstdb","root","tiger");
			String query= ("Delete from Student where sid=108");
			Statement smt=con.createStatement();
			int res=smt.executeUpdate(query);
			System.out.println("no of values "+res);
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			
			e.printStackTrace();
		}
	}

}
