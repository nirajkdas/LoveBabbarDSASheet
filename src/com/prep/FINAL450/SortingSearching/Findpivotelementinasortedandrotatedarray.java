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
public class Findpivotelementinasortedandrotatedarray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        int[] arr = {78,82,99,10,23,35,49,51,60};
        
        int low = 1;
        int high = arr.length-1;
        while(low <= high)
        {
            int mid = (high+low)/2;
            if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1])
            {
                System.out.println(arr[mid]);
                return;
                //break;
            }
            else if(arr[mid] > arr[low] && arr[high] > arr[mid])
            {
                low =mid+1;
            }
           else
            {
                high = mid-1;
            }
            
        }
        
        
        
        System.out.println("-1");
        
        
        
    }
    
}
