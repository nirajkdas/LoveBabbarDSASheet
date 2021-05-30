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
public class NextPermutation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] nums = {2,3,1};
        
        int last = nums.length-2;
        while(last >= 0)
        {
            if(nums[last] < nums[last+1])
            {
                break;
            }
            last--;
        }    
        
        if(last < 0)
        {
            Arrays.sort(nums);
            for(int i=0; i< nums.length;i++)
            {
                System.out.println(nums[i]);
            }
            return;
        }    
        
        int nextGreater = nums.length-1;
        for(int i = nums.length-1; i > 0; i--)
        {
            if(nums[i] > nums[last])
            {
                nextGreater = i;
                break;
            }
        }
        
      swap(nums,nextGreater,last);
      reverse(nums,last+1,nums.length-1);
      
       for(int i = 0; i < nums.length; i++)
          {
              System.out.println(nums[i]);
          }
      
      
    }
    
    public static void swap(int[] nums, int start, int end)
    {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
    
    public static void reverse(int[] nums, int start, int end)
    {
        while(start <= end)
        {
            swap(nums,start,end);
            start++;
            end--;
        }
    }       
    
    
}
