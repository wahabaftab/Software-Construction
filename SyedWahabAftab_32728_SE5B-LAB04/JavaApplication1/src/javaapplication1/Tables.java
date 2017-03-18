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
public abstract class Tables {
    int capacity;
    static int availability;
    String type;
    

}
class X_large extends Tables{
     public X_large(){
         capacity =12;
         availability=1;
         type= "Extra Large";
     }
     
 }
class large extends Tables{
     public large(){
         capacity =6;
         availability=3;
         type= "Large";
    }
 }

class medium extends Tables{
      public medium(){
         capacity =4;
         availability=8;
         type= "Medium";
     }
 }
class small extends Tables{
      public small(){
         capacity =2;
         availability=4;
         type= "Small";
     }
 }

