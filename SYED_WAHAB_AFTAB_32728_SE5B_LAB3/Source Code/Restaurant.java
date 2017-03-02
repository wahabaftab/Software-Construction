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


public class Restaurant {
    Table_Creator t;
    Order order;
    Priority_Queue P;
   public Restaurant(Order o,Priority_Queue Pq,Table_Creator tc)
   {
       this.t=tc;
       this.P=Pq;
       this.order=o;
   }
    public void booking()
    {
      if(t.T.type=="Extra Large")
      {   
         if(t.T.availability>0)  
         {
             if(order.party_priority>=P.get_highest()) // whoever has highest priority will get the extra large table
             {
           System.out.println("Extra Large table booked by "+order.total_members+"  members");
           System.out.println("Items ordered were   "+ order.items);
           System.out.println("Waiting time: "+ order.waiting_time+ " mins");
           System.out.println("Allocated time: "+order.time_allocated + " mins");

               t.T.availability--;
             }
         }
      }
      else if(t.T.type=="Large")
      {
         if (t.T.availability>0)
         {
           System.out.println("Large table booked by "+order.total_members+"  members");
           System.out.println("Items ordered were   "+ order.items);
           System.out.println("Waiting time: "+ order.waiting_time+ " mins");
           System.out.println("Allocated time: "+order.time_allocated + " mins");

           t.T.availability--;
         }

      }
      else if(t.T.type=="Medium")
      {
         if (t.T.availability>0)
         {
           System.out.println("Medium table booked by "+order.total_members+"  members");
           System.out.println("Items ordered were   "+ order.items);
           System.out.println("Waiting time: "+ order.waiting_time+ " mins");
           System.out.println("Allocated time: "+order.time_allocated + " mins");


           t.T.availability--;
         }
      }
      else if(t.T.type=="Small")
      {
         if (t.T.availability>0)
         {
           System.out.println("Small table booked by "+order.total_members+"  members");
           System.out.println("Items ordered were   "+ order.items);
           System.out.println("Waiting time: "+ order.waiting_time+ " mins");
           System.out.println("Allocated time: "+order.time_allocated + " mins");

           t.T.availability--;
         }
      }
    }
}
