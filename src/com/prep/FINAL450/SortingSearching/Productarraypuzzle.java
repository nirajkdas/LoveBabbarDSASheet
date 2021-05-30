/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prep.FINAL450.SortingSearching;

/**
 *
 * @author lpt-2188
 */
public class Productarraypuzzle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       int n = 5;
        int nums[] = {10, 3, 5, 6, 2};
        int[] left =  new int[n];
        int[] right = new int[n];
        left[0] = 1;
        
        for(int i = 1; i < n ; i++)
        {
            left[i] = left[i-1]*nums[i-1];
        }
        
        right[n-1] = 1;
        
        for(int i = n-2; i >= 0; i--)
        {
            right[i] = right[i+1] * nums[i+1];
        }
        
        int [] res = new int[n];
        for(int i = 0; i < n; i++)
        {
            res[i] = left[i] * right[i];
            System.out.println(res[i]);
        }
        
        
        
        
        
        
    }
    
}
