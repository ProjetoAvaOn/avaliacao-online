/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Victor
 */
public class MyConecton {
    private static Connection connection;

    public MyConecton() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost/online", "root","root");
        System.out.println("Conectado com sucesso");
    }   
    
    
    public static void main(String args[]) {
        try {
            new MyConecton(); 
        } catch (Exception e) {
            System.out.println("Nao conectado"); 
        }
  
    }
            
    
}
