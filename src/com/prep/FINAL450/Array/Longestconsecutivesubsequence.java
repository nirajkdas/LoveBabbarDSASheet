/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prep.FINAL450.Array;

import java.util.HashSet;

/**
 *
 * @author lpt-2188
 */
public class Longestconsecutivesubsequence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int N = 5;
        int arr[] = {1 ,2, 3, 4, 5};
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i = 0 ; i < N; i++ )
        {
            hs.add(arr[i]);
        }
        
        //int count = 0;
        int max_count = Integer.MIN_VALUE;
        
        for(int i = 0; i < N; i++)
        {
            if(!hs.contains(arr[i] - 1))
            {
                int j = arr[i];
                while(hs.contains(j))
                    j++;
                
                
                if(max_count < j - arr[i])
                    max_count = j - arr[i];
               
            }
        }
        
        
        System.out.println(max_count);
        
        
    }
    
}
