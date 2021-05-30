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
public class ReverseArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr = {1,2,3,4,5};
        for(int i = 0 ; i < arr.length;i++)
        {
            System.out.println(arr[i]);
        }  
        int start = 0;
        int end = arr.length-1;
        reverseArray(arr,start,end);
        
        System.out.println("--------------------------------");
        
        for(int i = 0 ; i < arr.length;i++)
        {
            System.out.println(arr[i]);
        } 
    }
    
    public static void reverseArray(int[] arr, int start, int end)
    {
        int temp;
        if(start >= end)
            return;
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArray(arr,start+1,end-1);
    }        
    
}
