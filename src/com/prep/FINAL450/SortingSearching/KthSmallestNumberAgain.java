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
public class KthSmallestNumberAgain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int i = 1, j = 5;
        int k[] = {1,3,6};

        int[] arr = new int[j];
        for(int x = i; x<=j;x++)
        {
            arr[x-1]=x;
        }
        
        for(int x = 0; x < k.length; x++)
        {
            System.out.println(findKthelement(arr,i-1,j-1,k[x]));
        }
        
    }
    public static int findKthelement(int[] arr, int i, int j, int k)
    {
        if(k > j)
            return -1;
        int pos = -1;
        pos = findlocation(arr,i,j);
        if(pos == k-1)
        {
            return arr[pos];
        }
        else if(pos < k-1)
         findKthelement(arr,i,pos-1,k);
        else
            findKthelement(arr,pos+1,j,k);
        
        return pos;
    }   
    static int findlocation(int[] arr, int i, int j)
    {
        int loc = i, x = arr[j];
        for(int y = i; y <= j ; y++)
        {
            if(arr[y] < x)
            {
                int temp = arr[loc];
                arr[loc] = arr[j];
                arr[j]= temp;
                j--;
                loc++;
            }
        }
        int temp = arr[loc];
        arr[loc] = arr[j];
        arr[j] = temp;
        return loc;
    }
    
}
