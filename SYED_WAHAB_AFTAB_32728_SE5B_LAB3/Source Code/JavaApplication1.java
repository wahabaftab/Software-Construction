/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
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
        Table_Creator TC= new Table_Creator();
        Priority_Queue PQ = new Priority_Queue();
        Order O= new Order("dinner",5,7,"L",PQ,TC); // CHANGE E/L/M/S here to change booking

        Restaurant R= new Restaurant(O,PQ,TC);

        R.booking();
        
    }
    
}
