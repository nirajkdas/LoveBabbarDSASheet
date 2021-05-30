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
public class Sort012Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] arr = {2,2,2,1,1,1,0,0,0,1,2,0};
        int low = 0,high = arr.length-1,mid =0,temp;
        while(mid <= high)
        {
            
            switch(arr[mid])
            {
                case 0 :{
                    temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                    break;
                }
                case 1 :{
                    
                    mid++;
                    break;
                }
                case 2 :{
                    temp = arr[high];
                    arr[high] = arr[mid];
                    arr[mid] = temp;
                    high--;
                    
                    break;
                }
            }
                
        }
        
        for(int i = 0 ; i < arr.length;i++)
        {
            System.out.println(arr[i]);
        }    
    }
    
}
