/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prep.FINAL450.Array;

import java.util.HashSet;

/**
 *
 * @author lpt-2188
 */
public class Subarraywith0sum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int [] arr = {4, 2 ,-3 ,1 ,6};
        int n = 5;
        
        int sum = 0;
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i = 0 ; i < n; i++)
        {
            sum = sum+arr[i];
            if(hs.contains(sum) || arr[i] == 0 || sum == 0 )
            {
                System.out.println("true");
                return;
            }
            else
                hs.add(sum);
        }
        
        System.out.println("false");
    }
    
}
