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
public class ChocolateDistribution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr = {17, 83, 59, 25, 38, 63, 25, 1, 37};
        int n = 9,m = 9;
        int min_diff = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i = 0; i <= n-m; i++)
        {
            int j =  m-1+i;
            int diff = arr[j] - arr[i];
            if(min_diff > diff)
            {
                min_diff = diff;
            }
        }
        System.out.println(min_diff);
    }
    
}
