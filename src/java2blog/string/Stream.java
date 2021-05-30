/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2blog.string;

import java.util.*;
import java.util.stream.*;

/**
 *
 * @author lpt-2188
 */
public class Stream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
   
       // Main ob = new Main(); 
        int array[] = {12, 3, 5, 7, 19}; 
        int n = array.length,k = 2; 
        System.out.println("K'th smallest element is "+ 
                           findKthElement(array, 0, n-1, k));
        
        
    }
    
    public static int findKthElement(int array[], int low, int high, int k) 
    { 
        // if k is smaller than number of elements in array  
        int pos = findkpos(array,low,high);
        if(pos == k)
        return array[pos];
        else if(pos < k)
        return findKthElement(array,pos+1,high,k);
        else
        return findKthElement(array,low,pos-1,k);
    }
    public static int findkpos(int[] arr,int low, int high)
    {
        int pos = low; int x = arr[high];
        for(int i = low; i <= high; i++)
        {
            if(arr[i] < arr[pos])
            {
                int temp = arr[pos];
                arr[pos] = arr[i];
                arr[i] = temp;
                pos++;
            }
        }
        
        int temp1 = arr[pos];
        arr[pos] = arr[high];
        arr[high] = temp1;
        return pos;
    }
    
}
