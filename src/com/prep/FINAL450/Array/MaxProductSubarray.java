/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prep.FINAL450.Array;

/**
 *
 * @author lpt-2188
 */
public class MaxProductSubarray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int N = 5;
        int arr[] = {6, -3, -10, 0, 2};
        
        int max_prod = arr[0];
        int min_prod = arr[0];
        int ans = arr[0];
        int choice1,choice2;
        for(int i = 1; i < N; i++)
        {
            choice1 = arr[i] * max_prod;
            choice2 = arr[i] * min_prod;
            max_prod = Math.max(arr[i],Math.max(choice1,choice2));
            min_prod = Math.min(arr[i],Math.min(choice1,choice2));
            ans = Math.max(max_prod,ans);
        }
        
       System.out.println(ans);
        
    }
    
}
