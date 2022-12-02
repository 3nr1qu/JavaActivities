/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaprog_dbconnection_siarot;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Student.Admin
 */
public class Connection {
    public static java.sql.Connection getConnection() throws ClassNotFoundException {
     
        java.sql.Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
             conn = DriverManager.getConnection("jdbc:mysql://localhost/login", "root", "");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return conn;
    }
}
