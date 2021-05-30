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
public class SearchinRotatedSortedArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         int [] nums = {4,5,6,7,0,1,2};int target = 0;
         
       // int[] nums = {1}; int target = 0;
         int start = 0;
        int end = nums.length - 1;
        while (start <= end){
            int mid = (start + end) / 2;
            if (nums[start] == target)
            {
                System.out.println(start);
                return ;
            }
            if (nums[end] == target)
            {
                System.out.println(end);
                return ;
            }
            if (nums[mid] == target)
            {
                System.out.println(mid);
                return ;
            }
        
            if (nums[start] <= nums[mid]){
                 if (target < nums[mid] && target >= nums[start]) 
                    end = mid - 1;
                 else
                    start = mid + 1;
            } 
        
            if (nums[mid] <= nums[end]){
                if (target > nums[mid] && target <= nums[end])
                    start = mid + 1;
                 else
                    end = mid - 1;
            }
        }
       System.out.println("-1");
        
             
         }
         
    
    
}
