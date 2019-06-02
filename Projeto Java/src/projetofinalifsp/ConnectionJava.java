/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinalifsp;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Danilo Grando
 */
public class  ConnectionJava  {
    
        public static Connection getConnection() throws SQLException { 

        Connection con = null;
        
        try  {
                DriverManager.getConnection("jdbc:sqlserver://localhost;user=sa;password=sa" );
                

           Statement stmt = con.createStatement();
           String SQL = "SELECT TOP 10 * FROM Person.Contact";
           ResultSet rs = stmt.executeQuery(SQL);

          while (rs.next()) {
               System.out.println(rs.getString("FirstName") + " " + rs.getString("LastName"));
           }
        }
        
        catch (SQLException e) {
            e.printStackTrace();
        }
        
        return con;
    }
}


