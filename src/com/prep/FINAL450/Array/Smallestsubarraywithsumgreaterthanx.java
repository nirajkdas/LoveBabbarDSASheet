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
public class Smallestsubarraywithsumgreaterthanx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       // int [] A = {1, 4, 45, 6, 0, 19};
        int A[] = {1, 10, 5, 2, 7};
       // int x = 51;
        int x = 9;
        
        Arrays.sort(A);
        
        int low = 0, high = A.length-1;
        int min_diff = Integer.MAX_VALUE;
        int res_low = 0, res_high=0;
        int sum = 0;
        while(low <= high)
        {
            sum = sum+ A[low] + A[high];
            
            int diff = sum - x;
            if(diff > 0)
            {    
            if(min_diff > diff)
            {
              min_diff = diff;
              res_low = low;
              res_high = high;
            }
            else if(diff > min_diff)
            {
                 sum = sum - A[high];
                high--;
               
            }
            else
            {   
                 sum = sum-A[low];
                low++;
               
            }
            }
            else
            {
                low++;
                high--;
            }
        }
        
        System.out.println(res_high - res_low);
    }
    
}
