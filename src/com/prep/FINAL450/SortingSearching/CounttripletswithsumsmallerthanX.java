/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prep.FINAL450.SortingSearching;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author lpt-2188
 */
public class CounttripletswithsumsmallerthanX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
     //   int N = 4, X = 2;
     //   int arr[] = {-2, 0, 1, 3};
          int N = 5, X = 12;
          int arr[] = {5, 1, 3, 4, 7};
        Arrays.sort(arr);
        int ans = 0;
        for(int i = 0; i < N-2; i++)
        {
           int j = i+1;
           int k = N-1;
           while(j < k)
           {
               if(arr[i]+arr[j]+arr[k] < X)
               {
                
                   ans+=(k-j);
                   j++;
                   //k--;
               }
               else
               {
                   k--;
               }
           }
            
        }
        System.out.println(ans);
        
        
        
        
        
    }
    
}
