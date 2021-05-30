/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prep.logicMojo.Array;

import java.util.Arrays;

/**
 *
 * @author lpt-2188
 */
public class NextGreaterInteger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] A = {1, 2, 3};
        int i;
        for(i = A.length-1; i > 0; i--)
        {
            if(A[i] > A[i-1])
            {
                break;
            }
        }
        
        int x = A[i-1],min = i;
        for(int j = min+1; j < A.length; j++)
        {
            if(A[j] > x && A[j] > A[min])
            {
                min = j;
                break;
            }
        }
        swap(A,i - 1,min);
        Arrays.sort(A,i,A.length);
       // Arrays.r
        System.out.println(Arrays.toString(A));
        
    }
    public static void swap(int[] A, int start, int end)
    {
        int temp = A[start];
        A[start] = A[end];
        A[end] = temp;
    }
}
