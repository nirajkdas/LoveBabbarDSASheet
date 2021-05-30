/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prep.FINAL450.SortingSearching;

import java.util.Arrays;
import java.util.HashMap;

/**
 *
 * @author lpt-2188
 */
public class MinimumSwapstoSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int [] nums = {10, 19, 6, 3, 5};//{2, 8, 5, 4};
        
        int[] temp = Arrays.copyOf(nums, nums.length);
        
        Arrays.sort(temp);
        HashMap<Integer,Integer> hm = new HashMap<Integer, Integer>();
        
        for(int i = 0; i < nums.length; i++)
        {
            hm.put(nums[i],i);
        }
        
        int ans = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(temp[i] != nums[i])
            {
                ans++;
                swap(nums,i,hm.get(temp[i]));
                hm.put(nums[i],hm.get(temp[i]));
                hm.put(temp[i],i);
                
            }
        }
        System.out.println(ans);
        
    }
    static void swap(int[] nums, int x, int y)
    {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
}
