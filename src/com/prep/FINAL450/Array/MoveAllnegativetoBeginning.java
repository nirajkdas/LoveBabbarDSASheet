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
public class MoveAllnegativetoBeginning {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        int low = 0,mid = 0,high = arr.length-1;
        while(mid <= high)
        {
            int temp;
            if(arr[mid] < 0)
            {
                temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            }
            else
            {
                //temp = arr[mid];
                //arr[mid] = arr[high];
                //arr[high] = temp;
                //high--;
                mid++;
            }    
        }
        for(int i = 0; i < arr.length;i++)
        {
            System.out.println(arr[i]);
        }    
    }
    
}
