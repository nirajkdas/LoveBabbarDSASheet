/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prep.FINAL450.Array;

import java.util.Arrays;

/**
 *
 * @author lpt-2188
 */
public class MaxDifferecneBetweenHeights {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr = {3, 9, 12, 16, 20};
        int n = 5,k =3;
        
        Arrays.sort(arr);
        
        int res = arr[n-1] - arr[0];
        int max =0,min = 0;
        for(int i=1; i < n; i++)
        {
            if(arr[i]>= k)
            {    
            max = Math.max(arr[i-1]+k,arr[n-1]-k);
            min = Math.min(arr[i]-k,arr[0]+k);
            res = Math.min(res, max-min);
            }
            else
            {
                continue;
            }
        }    
        
       System.out.println(res);
    }
    
}
