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
public class KthelementoftwosortedArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int arr1[] = {100, 112, 256, 349, 770};
        int arr2[] = {72, 86, 113, 119, 265, 445, 892};
        int n = 5, m = 7;
        int k = 7;
        
        
        
        int i =0,j = 0,x = 0;
        while(i < n && j < m)
        {
            if(arr1[i] < arr2[j])
            {
                x++;
                if(x == k)
                {   
                    System.out.println(arr1[i]);
                    return;
                }
                i++;
            }
            else
            {
                x++;
                if(x == k)
                {
                    System.out.println(arr2[j]);
                    return;
                }
                j++;
            }
        }
        
        
        if(n < m)
        {
            while(j < m)
            {
                x++;
                if(x == k)
                {
                    System.out.println(arr2[j]);
                    return;
                }
                j++;
            }
        }
        else
        {
            while(i < n)
            {
                x++;
                if(x == k)
                {
                    System.out.println(arr1[i]);
                    return;
                }
                i++;
            }
        }
        
        System.out.println("-1");
        
    }
    
}
