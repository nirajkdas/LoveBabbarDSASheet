/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2blog.string;

/**
 *
 * @author lpt-2188
 */
public class reversearray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] arr = {1,2,3,4,5};
        int n = 5;
        
        int start =0,end = n-1;
        reverse(arr,start,end);
        for(int i =0; i < n ; i++)
            System.out.println(arr[i]);
    }
    public static void reverse(int[] arr, int start, int end)
    {
        if(start >= end)
            return;
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
        reverse(arr,start,end);
    }        
    
}
