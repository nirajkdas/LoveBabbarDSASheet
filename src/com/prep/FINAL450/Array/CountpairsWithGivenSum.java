/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prep.FINAL450.Array;

import java.util.HashMap;

/**
 *
 * @author lpt-2188
 */
public class CountpairsWithGivenSum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] arr = {1,5,7,1};
       int n = 4,k = 6;
       
       HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
       
       for(int i = 0; i < n ;i ++)
       {
           if(!hm.containsKey(arr[i]))
           {
               hm.put(arr[i],0);
           }
           hm.put(arr[i],hm.get(arr[i])+1);
       }
       
       int count = 0;
       
       for(int i = 0; i < n ; i++)
       {
           if(hm.get(k-arr[i]) != null)
           {
               count += hm.get(k-arr[i]);
           }
           if(k-arr[i] == arr[i])
               count = count-1;
       }
       System.out.println(count/2);
    }
    
}
