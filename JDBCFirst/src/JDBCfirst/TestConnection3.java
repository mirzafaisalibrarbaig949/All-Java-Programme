package JDBCfirst;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;

public class TestConnection3 {
	public static void main(String[] args) {

		try {
		Driver	driver = new Driver();
			DriverManager.registerDriver(driver);
			FileInputStream f=new FileInputStream("myDbInfo.properties");
			Properties properties=new Properties();
			properties.load(f);
			String url="jdbc:mysql://localhost:3306/firstdb";
			Connection con=DriverManager.getConnection(url,properties);
			System.out.println("Connected Succesfully");
			con.close();
		} catch (SQLException  | IOException e) {
			
			e.printStackTrace();
		}
	}

}
