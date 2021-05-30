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
public class RearrangePositiveNegative {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here //Not completed
        int  arr[] = {1, 2, 3, -4, -1, 4};
        
        int n = arr.length;
        
    /*    for(int i = 1; i < n; i++)
        {
            int key = arr[i];
            if(key > 0)
                continue;
            int j = i-1;
            while(j >= 0 && arr[j]>0)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            
            arr[j+1] = key;
        }
        */
    int low = 0;
    int high = n-1;
    
   /* while(low < high)
    {
        if(arr[low] > 0)
        {
            while(arr[high] > 0)
                high--;
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }*/
   
   
   //2-pointer Approach

    while(low <= high)
    {
        if(arr[low] < 0 && arr[high] < 0)
        {
            low++;
        }
        else if(arr[low] > 0 && arr[high] < 0)
        {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        else if(arr[low] > 0 && arr[high] > 0)
        {
            high--;
        }
        else
        {
            high--;
            low++;
        }
    }
   
        
        
        for(int i = 0 ; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
        
        
    }
    
}
