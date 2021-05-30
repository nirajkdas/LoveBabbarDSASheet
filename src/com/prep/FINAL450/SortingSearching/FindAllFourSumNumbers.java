/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prep.FINAL450.SortingSearching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author lpt-2188
 */
public class FindAllFourSumNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       int N = 5, K = 3;
       int A[] = {0,0,2,1,1};
       
       Arrays.sort(A);
       ArrayList<ArrayList<Integer>> quadruple = new ArrayList<>();
       
       for(int i = 0; i < N-3; i++)
       {
           for(int j = i+1; j < N-2; j++)
           {
               int sum = A[i]+A[j];
               int sum_tofind = K - sum;
               int start = j+1;
               int end = N-1;
               while(start < end)
               {
                   if(A[start]+A[end] == sum_tofind)
                   {
                      // quadruple.add(Arrays.asList(A[i],A[j],A[start],A[end]));
                       ArrayList<Integer> ar = new ArrayList<>();
                       ar.add(A[i]);
                       ar.add(A[j]);
                       ar.add(A[start]);
                       ar.add(A[end]);
                       quadruple.add(ar);
                       start++;
                       end--;
                   }
                   else if(A[start]+A[end] < sum_tofind)
                   {
                       start++;
                   }
                   else
                   {
                       end--;
                   }
               }
           }
       }
        
       System.out.println(quadruple); 
        
        
        
        
        
        
        
    }
    
}
