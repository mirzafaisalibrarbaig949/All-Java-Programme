package JDBC1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteTest {
	public static void main(String[] args) {
		
	
try{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/m2e2jdbcday1","root","tiger");
		Statement smt=con.createStatement();
//	String query="DELETE FROM student WHERE name='Jatin'";
		String query="UPDATE  student SET age=66 WHERE name='Jatin'";
	int result=smt.executeUpdate(query);
	System.out.println(result);

}
catch (ClassNotFoundException | SQLException e) 
{
// TODO Auto-generated catch block
e.printStackTrace();
}
}
}
