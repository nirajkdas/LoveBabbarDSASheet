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
public class CountElementFrequencyLinearTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] arr = {5, 1, 2, 5, 5, 5, 1, 1, 2, 2};
        
        int n = arr.length;
        
        for(int i = 0; i < n; i++)
        {
            arr[i] = arr[i] -1;
        }
        
        for(int i = 0; i < n;i++)
        {
            if(arr[i] > n)
            {
                int a = arr[i]%n;
                arr[a] = arr[a]+n;
            }
            else
            {
                arr[arr[i]] +=n;
            }
        }
        
        for(int i = 0; i < n; i++)
        {
            System.out.println(i+1+" ->"+arr[i]/n);
        }
    }
    
}
