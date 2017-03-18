/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.sql.*;

/**
 *
 * @author swaha_000
 */
public class Connector {
    public void Database(){
        
    try{
    String host="jdbc:derby://localhost:1527/Restaurant";
     String user="";
     String pass="";
     
     Connection con= (Connection) DriverManager.getConnection(host,user,pass);
    }
    catch(SQLException err){
        System.out.println(err.getMessage());
}
    }
}