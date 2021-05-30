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
public class Merge2ArraysWithoutExtraSpace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr1 = {1,3,5,7};
        int[] arr2 = {0,2,6,8,9};
        int n = arr1.length;
        int m = arr2.length;
        int i=0,j=0,k = n-1;
        while(i <= k && j < m)
        {
            if(arr1[i] < arr2[j])
            {
                i++;
            }
            else
            {
                int temp = arr2[j];
                arr2[j] = arr1[k];
                arr1[k] = temp;
                k--;
                j++;
            }    
        }
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        for(int l = 0; l< n; l++)
        {
            System.out.println(arr1[l]);
        }
        System.out.println("----------------");
        for(int p = 0;p < m; p++)
            System.out.println(arr2[p]);
    }
    
}
