package JDBCfirst;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class TestConnection2 {
	public static void main(String[] args) {
		try {
			Driver driver=new Driver();
			DriverManager.registerDriver(driver);
			DriverManager.getConnection("jdbc:mysql://localhost:3306/firstdb?user=root&password=tiger");
			System.out.println("connected");
   		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
