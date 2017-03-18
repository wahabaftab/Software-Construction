/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner; // This will import just the Scanner class.
import java.util.*; // This will import the entire java.util package.
/**
 *
 * @author swaha_000
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc=new Scanner(System.in);
    String name;
    name=sc.next();
         try{
    String host="jdbc:derby://localhost:1527/Restaurant";
     String user="";
     String pass="";
     
     Connection con= (Connection) DriverManager.getConnection(host,user,pass);
     Statement s=con.createStatement();
     String q="SELECT username from customer  where username='name'";
     ResultSet result= s.executeQuery(q);
     

    }
    catch(SQLException err){
        System.out.println(err.getMessage());
}
         
        Table_Creator TC= new Table_Creator();
        Priority_Queue PQ = new Priority_Queue();
        Order O= new Order("wahab","dinner",5,7,"L",PQ,TC,5,5); // CHANGE E/L/M/S here to change booking
        Order O1 = new Order("saad","lunch",4,8,"",PQ,TC,7,6);
        Restaurant R= new Restaurant(O,PQ,TC);
        Restaurant R1= new Restaurant(O1,PQ,TC);
        
        R.booking();
        R1.booking();
      
        System.out.println("Contents of date"+ R1.date);
        System.out.println("Contents of name"+ R1.name);
        System.out.println("Contents of time"+ R1.time);

    }
    
}
