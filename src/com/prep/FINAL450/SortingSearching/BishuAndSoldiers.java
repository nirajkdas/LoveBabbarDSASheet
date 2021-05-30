/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prep.FINAL450.SortingSearching;

import java.util.Arrays;

/**
 *
 * @author lpt-2188
 */
public class BishuAndSoldiers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 7;
        int [] arr = {1,2,3,4,5,6,7};
        int t = 10;
        int  power = 3;
        
        Arrays.sort(arr);
        int sum = 0;
        int count = 0;
        for(int i = 0; i < n; i++)
        {
            if(arr[i] <= t)
            {
                sum = sum + arr[i];
                count++;
            }
        }
        
        System.out.println(count+" "+sum);
        
        
    }
    
}
