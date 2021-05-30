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
public class UnionOfArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int m = 5, n = 3;
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3};
        
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        int count = 0;
        for(int i = 0 ; i < m; i++)
        {            
            if(!hm.containsKey(arr1[i]))
            {   
              hm.put(arr1[i], 1);
              count++;
            }
        }
        for(int i = 0; i < n; i++)
        {
            if(!hm.containsKey(arr2[i]))
            {   
              hm.put(arr2[i], 1);
              count++;
            }
        }
        
        System.out.println(count);
    }
    
}
