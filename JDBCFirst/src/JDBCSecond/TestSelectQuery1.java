package JDBCSecond;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestSelectQuery1 {

	public static void main(String[] args) {
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/firstdb", "root", "tiger");
			String query = ("Select * from Student");
//			String query="Insert into Student values(107,'Sounhagya','soubhagya@gmail.com',20)";
			Statement smt = con.createStatement();
//			int res=smt.executeUpdate(query);
//			System.out.println("no of rows: "+res);
			
//			ResultSet res = smt.executeQuery(query);
//			System.out.println("no of values "+res);
			boolean result =smt.execute(query);
			if(result) {
						ResultSet res1=smt.getResultSet();
						System.out.println(result);
						System.out.println();
				
			while (res1.next()) {
				
				System.out.println("Id: " + res1.getInt(1));
				System.out.println("name: " + res1.getString(2));
				System.out.println("coruse: " + res1.getString(3));
				System.out.println("Age: " + res1.getInt(4));
				System.out.println("..................................");
//				System.out.println(res);
				}
			}
		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}

	}

}
