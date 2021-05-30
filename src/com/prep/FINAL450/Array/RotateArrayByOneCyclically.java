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
public class RotateArrayByOneCyclically {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 5;
        int[] arr = {1, 2, 3, 4, 5};
        
        int x = arr[arr.length-1];
        
        for(int i = arr.length-1; i > 0; i--)
            arr[i] = arr[i-1];
        arr[0] = x;
        
        for(int i = 0 ; i < arr.length ; i++)
            System.out.println(arr[i]);
        
    }
    
}
