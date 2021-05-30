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
public class MergeWithoutExtraSpace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        int N = 4, M = 5;
        int arr1[] = {1, 3, 5, 7};
        int arr2[] = {0, 2, 6, 8, 9};
        
        
        int i = 0, j = 0,k= N-1;
        
        while(i <= k && j < M-1)
        {
            if(arr1[i] > arr2[j])
            {
                int temp = arr1[k];
                arr1[k] = arr2[j];
                arr2[j] = temp;
                j++;
                k--;
            }
            else
            {
                i++;
                //j++;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int x = 0; x < N; x++)
        System.out.println(arr1[x]);
        for(int y = 0; y < M; y++)
        System.out.println(arr2[y]);
        
    }
    
}
