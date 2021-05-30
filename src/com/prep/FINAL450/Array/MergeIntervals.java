/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prep.FINAL450.Array;

import java.util.Arrays;
import java.util.Stack;

/**
 *
 * @author lpt-2188
 */
public class MergeIntervals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int [][] intervals =  {{1,3},{2,6},{8,10},{15,18}};
     
      Arrays.sort(intervals,(arr1,arr2)->Integer.compare(arr1[0],arr2[0]));
     Stack<[]int>s = new Stack<[]int>();
     s.push(intervals[0]);
     for(int[] interval : intervals)
     {
         int[] top_list = s.peek();
         if(top_list[1] < interval[0])
         {
             s.push(interval);
         }
         else if(top_list[1] < interval[1])
         {
             top_list[1] = interval[1];
             s.pop();
             s.push(top_list);
         }
     }
     
     System.out.println(s.toArray([s.size()][2]));
     
     
    }
    
}
