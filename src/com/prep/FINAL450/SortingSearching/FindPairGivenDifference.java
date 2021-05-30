/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prep.FINAL450.SortingSearching;

import java.util.HashMap;

/**
 *
 * @author lpt-2188
 */
public class FindPairGivenDifference {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int L = 6, N = 78;
        int arr[] = {5, 20, 3, 2, 5, 80};
        
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i = 0; i < L; i++)
        {
            hm.put(arr[i],arr[i]);
        }
        
        for(int i = 0; i < L; i++)
        {
            if(hm.containsKey(N+arr[i]))
            {
                System.out.println("true");
                return;
                      
            }
        }
        
        System.out.println("false");
        
    }
    
}
