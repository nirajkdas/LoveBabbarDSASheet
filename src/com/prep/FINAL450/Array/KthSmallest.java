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
public class KthSmallest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] arr = {7,10,4,3,20,15};
        int k = 3;
       
        //Simple solution
        /*Arrays.sort(arr);
        System.out.println(arr[k-1]);*/
        
        //Efficient solution
        int start = 0;
        int end = arr.length-1;
        findkthElement(arr,start,end,k);
       
        
    }
    
    public static void findkthElement(int[] arr, int start, int end, int k)
    {
        int pos = findkth(arr,start,end);
        
        if(pos == k-1)
        System.out.println(arr[pos]);
        else if(pos < k-1)
         findkthElement(arr,pos+1,end,k);  
        else
          findkthElement(arr,start,pos-1,k);
    }
    
    public static int findkth(int[] arr, int start, int end)
    {
        int x = arr[end],posloc = start;
        for(int i = start; i <= end; i++)
        {
            if(arr[i]< x)
            {
                int temp = arr[i];
                arr[i] = arr[posloc];
                arr[posloc] = temp;
                posloc++;
            }    
        }
        int temp = arr[end];
        arr[end]= arr[posloc];
        arr[posloc] = temp;
        
        return posloc;
        
    }        
}
