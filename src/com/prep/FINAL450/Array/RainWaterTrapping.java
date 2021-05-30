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
public class RainWaterTrapping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int N = 6;
        int arr[] = {3,0,0,2,0,4};
        
        int left[] = new int[N];
        int leftmax = arr[0];
        int right[] = new int[N];
        int rightmax = arr[N-1];
        
        for(int i = 0; i< N; i++)
        {
            if(leftmax < arr[i])
            {
                left[i] = arr[i];
                leftmax = arr[i];
            }
            else
                left[i] = leftmax;
        }
        
        for(int i = N-1; i >= 0; i--)
        {
            if(rightmax < arr[i])
            {
                right[i] = arr[i];
                rightmax = arr[i];
            }
            else
                right[i] = rightmax;
                 
        }
        
        int sum = 0;
        for(int i = 0; i < N; i++)
        {
            sum = sum + (Math.min(left[i],right[i]) - arr[i]);
        }
        System.out.println(sum);
    }
    
}
