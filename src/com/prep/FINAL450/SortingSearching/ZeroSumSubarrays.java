/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prep.FINAL450.SortingSearching;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lpt-2188
 */
public class ZeroSumSubarrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int n = 6;
        int arr[] = {0,0,5,5,0,0};
        
        
        List<List<Integer>> res = new ArrayList<>();
        int sum = 0;
        int count = 0;
       
        int i = 0;
        while(i < n)
        {
            sum = sum+arr[i];
            if(sum == 0)
            {
                ArrayList<Integer> ar = new ArrayList<>();
                ar.add(arr[i]);
                res.add(ar);
                count++;
            }
           
        }
        
        
        
        
        
        System.out.println(count);
        
    }
    
}
