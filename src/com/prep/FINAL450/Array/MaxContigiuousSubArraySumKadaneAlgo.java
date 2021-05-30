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
public class MaxContigiuousSubArraySumKadaneAlgo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arr[] = {1, 2, 3, -2,5};
        int n = 5;
        
        int max_so_far = arr[0],max_res = arr[0];
        for(int i=1;i<n;i++)
        {
            max_so_far = Math.max(arr[i],max_so_far+arr[i]);
            max_res = Math.max(max_res, max_so_far);
        }    
        System.out.println(max_res);
        
    }
    
}
