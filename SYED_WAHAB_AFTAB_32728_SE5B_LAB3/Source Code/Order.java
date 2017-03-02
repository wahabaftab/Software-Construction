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
import java.util.ArrayList;
import java.util.List;

public class Order {
    String type;            //dinner or lunch
    int items;              // quantity of items
    int total_members;      //total people ordering
    int time_allocated;
    int waiting_time;
    List<Integer> listA = new ArrayList();
    Table_Creator T;
    Priority_Queue PQ;
    int party_priority;             // 5 is highest and 1 is lowest
    public void set_priority()
    {
        if(total_members>=10)
           party_priority=5;
        
        else if( total_members>=8 && total_members<10)
           party_priority=4;
        
        else if(total_members>=6 && total_members<8)
           party_priority=3;
        
        else if(total_members>=4 && total_members<6)
           party_priority=2;
        
        if(total_members <4)
           party_priority=1;
    }        
        public int get_priority()
    {
        return party_priority;
    }
    
    Order(String a, int b, int c,String t, Priority_Queue pq,Table_Creator TC){
        this.type=a;
        this.items=b;
        this.total_members=c;
        this.time_allocated=(this.total_members)*20;         //30mins per member
        this.waiting_time=  this.items*7;                              // each item takes 30 mins but done by 4 chefs
       
        this.PQ=pq;
        this.T=TC;
        set_priority();
        this.listA.add(get_priority());
        PQ.queue(listA);
        T.create_table(t);
    }
    
}
