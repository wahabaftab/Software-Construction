/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author swaha_000
 */
public class Table_Creator {
    Tables T;
    public void create_table(String c){
        if(c=="E") 
            T=new X_large();
        
        else  if(c=="L")
            T= new large();
        
         else  if(c=="M") 
            T= new medium();
        
         else  if(c=="S")
            T= new small(); 
    }
}
