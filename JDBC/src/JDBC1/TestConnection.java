
package JDBC1;

import java.sql.Connection;
import java.sql.DriverManager;


//JDBC Fiest programme:
//import java.sql.*;

class TestConnection{
  public static void main(String[] args) {
      try 
      {
          //load the driver
          Class.forName("com.mysql.cj.jdbc.Driver");
          //Crete a COnnection
         // String url="jdbc:mysql://localhost:3306/student"; 
         // String username="root";
         // String password="tiger";
          Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/m2e2jdbcday1","root","tiger");
//          if(con.isClosed())
//          {
//              System.out.println("Connection Closed");
//             
//          }
//          else{
//              System.out.println("connection create...");
//          }
//          
          System.out.println("connectio build succesfully");
      } catch (Exception e) 
      {
          e.printStackTrace();
      }
  }
}
