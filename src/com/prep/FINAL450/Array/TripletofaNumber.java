/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prep.FINAL450.Array;

import java.util.Collections;

/**
 *
 * @author lpt-2188
 */
public class TripletofaNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        int X = 986,n = 24;
        int[] A = {557, 217, 627, 358, 527, 358, 338, 272, 870, 362, 897, 23, 618, 113, 718, 697, 586, 42, 424, 130, 230, 566, 560, 933};
        
        for(int i = 0; i < n; i ++)
        {
            for(int j = i+1; j < n; j++)
            {
                if(A[i] > A[j])
                {
                    int temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
        }
       // Collections.sort(A);
          int pivot = A[0];
       int second = 1;
       int third = n-1;
       while(second <= third)
       {
           int sum =pivot+A[second]+A[third]; 
           if(sum == X)
           {
               System.out.println("1");
               return ;
           }
           else if(sum >  X)
           {
               third--;
           }
           else
           {
               second++;
           }
       }
        System.out.println("0");
        
        
        
        
    }
    
}
