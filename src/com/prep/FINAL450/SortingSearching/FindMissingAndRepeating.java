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
public class FindMissingAndRepeating {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int N = 2;
        int Arr[] = {2, 2};
        
        for(int i = 0; i < N; i++)
        {
            int num = Math.abs(Arr[i]);
            if(Arr[num-1] > 0)
            {
                Arr[num-1] = - Arr[num-1];
            }
            else
            {
                System.out.println("Duplicate=>"+num);
            }
        }
        for(int i = 0 ; i < N; i++)
        {
            if(Arr[i] > 0)
            {
                System.out.println("Missing=>"+(i+1));
            }
        }
        
        
    }
    
}
