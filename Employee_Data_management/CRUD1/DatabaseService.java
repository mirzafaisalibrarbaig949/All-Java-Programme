package CRUD1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.mysql.cj.xdevapi.PreparableStatement;

public class DatabaseService {
	DataBase dataBase=new DataBase();
	public void insertEmployee(Employee employee) {
		try {
			Connection con = dataBase.getConnection();
			Statement smt = con.createStatement();	
			int res = smt.executeUpdate(Query.insertEmployessQuery());
//			smt.setString
//			PreparableStatement preparableStatement
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
