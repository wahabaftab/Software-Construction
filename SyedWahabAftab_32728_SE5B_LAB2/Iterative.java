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
public class Iterative {
   // Declaring Variables
    int sum; 
    int first_matrix_row;
    int second_matrix_row;

    int first_matrix_col;
    int second_matrix_col;
    
    int first_matrix[][];
    int second_matrix[][];
    Iterative(int a , int b , int c, int d, int first[][], int second[][]){
       //initializing values
        this.first_matrix_row=a;
        this.first_matrix_col=b;
        this.second_matrix_row=c;
        this.second_matrix_col=d;
        
        first_matrix= new int [first_matrix_row][first_matrix_col];
        first_matrix= first;
        second_matrix= new int [second_matrix_row][second_matrix_col];
        second_matrix=second;
    }
    
    public int[][] multiplication(){
        //doing multiplication
                int product[][] = new int[first_matrix_row][second_matrix_col];

          for ( int c = 0 ; c < first_matrix_row ; c++ )
         {
            for ( int d = 0 ; d < second_matrix_col ; d++ )
            {   
               for ( int k = 0 ; k < second_matrix_row ; k++ )
               {
                  sum = sum + first_matrix[c][k]*second_matrix[k][d];
               }
 
               product[c][d] = sum;
               sum = 0;
            }
        
    }
     return product;
}

}