/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prep.logicMojo.Array;

/**
 *
 * @author lpt-2188
 */
public class MaxValueInArrayWithIncreasingDecreasing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int array[] = {3, 5,15, 50, 11, 10, 8, 6};
        int low = 0,high = array.length-1;
        while(low <= high)
        {
            int mid = low+(high-low)/2;
            if(array[mid] > array[mid+1] && array[mid] > array[mid-1])
            {
                System.out.println(array[mid]);
                break;
            }
            if(array[mid] > array[mid-1] && array[mid] < array[mid+1])
            {
                low = mid+1;
            }
            else
            {
                high = mid-1;
            }
            
        }
        
        
        
    }
    
}
