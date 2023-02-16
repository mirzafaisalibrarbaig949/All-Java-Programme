package JDBCSecond;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestSelectQuery {
	public static void main(String[] args) {
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/firstdb", "root", "tiger");
			String query = ("Select * from Student");
			Statement smt = con.createStatement();
			ResultSet res = smt.executeQuery(query);
//			System.out.println("no of values "+res);
			res.next();
			System.out.println("Id: " + res.getInt(1));
			System.out.println("name: " + res.getString(2));
			System.out.println("coruse: " + res.getString(3));
			System.out.println("Age: " + res.getInt(4)); 
			System.out.println();
			
			res.next();
			System.out.println("Id: " + res.getInt(1));
			System.out.println("name: " + res.getString(2));
			System.out.println("coruse: " + res.getString(3));
			System.out.println("Age: " + res.getInt(4));
			System.out.println();
			
			
			
//				System.out.println(res);
		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
	}

}
