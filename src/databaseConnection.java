/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

//database connection class
public class databaseConnection {
    final static String JDBC_DRIVER="com.mysql.jdbc.Driver";
    final static String  DB_URL=  "jdbc:mysql://localhost:3306/student";
    final static String USER="naseem";
    final static String PASS="naseem123";
   
    //static method of  this class that will retuen object of Connection through getconnection method of driver manager class bacause we can't instantiate a interface
    public static Connection connection(){
      try
      {
          Class.forName(JDBC_DRIVER);
          Connection con=DriverManager.getConnection(DB_URL, USER, PASS);
          return con;
          
      }catch(ClassNotFoundException | SQLException ex)
      {
          JOptionPane.showMessageDialog(null,ex);
          System.out.println(ex);
          return null;
          
      }
    }
    
    
   
    
    
    
    
    
    
}
