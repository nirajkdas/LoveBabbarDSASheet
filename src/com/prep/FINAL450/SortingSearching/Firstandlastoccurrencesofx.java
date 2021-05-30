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
public class Firstandlastoccurrencesofx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int n=9, x=5;
        int arr[] = { 1, 3, 5, 5, 5, 5, 67, 123, 125 };
       
   //  int n=9, x=7;
   // int arr[] = { 1, 3, 5, 5, 5, 5, 7, 123, 125 };
     
        int low = 0;
        int high = n-1;
        int index = 0;
        while(low < high)
        {
            int mid = (high+low)/2;
            if(arr[mid] == x)
            {
                index = mid;
                break;
            }
            else if(arr[mid] > x)
            {
                high = mid-1;
            }
            else
            {
                low = mid+1;
            }
        }
        int start = findstart(arr,index);
        int end = findend(arr,index);
        if(start == index && end == index)
        {
            System.out.println(index+1);
        }
        else
        {
            System.out.println("end=>"+end+"start=>"+start);
        }
    }
    static int findstart(int[]arr, int index)
    {
        int res = index;
        for(int i = index-1; i >= 0; i--)
        {
            if(arr[index] == arr[i])
            {
                res--;
            }
        }
        return res;
    }
    static int findend(int[] arr, int index)
    {
        int res = index;
        for(int i = index+1; i < arr.length; i++)
        {
            if(arr[index] == arr[i])
            {
                res++;
            }
        }
        return res;
    }
}
