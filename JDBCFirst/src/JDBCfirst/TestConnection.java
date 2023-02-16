package JDBCfirst;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;




class TestConnection{
  public static void main(String[] args) throws SQLException {
      try 
      {
     
          Class.forName("com.mysql.cj.jdbc.Driver");
        
          Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/firstdb","root","tiger");
          
          System.out.println("connectio build succesfully");
          con.close();
      } catch (Exception e) 
      {
          e.printStackTrace();
      }
  }
}
