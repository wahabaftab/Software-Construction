/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author test1
 */
import java.util.Scanner;
public class Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a [][]= {{3,5,6},{2,3,5}, {5,3,6}};
        int b [][]= { {3,6,7}, {3,8,9},{4,6,7} };
        Iterative i=  new Iterative (3,3,3,3,a,b);

        int result[][]= i.multiplication();
        
         for (int c = 0 ; c < i.first_matrix_row ; c++ )
         {
            for (int  d = 0 ; d < i.second_matrix_col ; d++ )
               System.out.print(result[c][d]+"\t");
 
            System.out.print("\n");
         }

    }
    
}
