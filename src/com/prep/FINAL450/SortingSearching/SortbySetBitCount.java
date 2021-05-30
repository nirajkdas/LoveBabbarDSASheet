/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prep.FINAL450.SortingSearching;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author lpt-2188
 */
public class SortbySetBitCount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Integer arr[] = {5, 2, 3, 9, 4, 6, 7, 15, 32};
        int n = arr.length;
        Arrays.sort(arr, new Comparator<Integer>(){
            @Override
            public int compare(Integer a1,Integer a2)
            {
                int c1 = Integer.bitCount(a1);
                int c2 = Integer.bitCount(a2);
                if(c1 <= c2)
                    return 1;
                else if(c1 == c2)
                    return 0;
                else
                    return -1;
            }
        });
       
        
       for(int i = 0; i < n; i++)
       {
           System.out.println(arr[i]);
       }
        
        
    }
    
}
