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
import java.util.*;
public class DuplicateInArrayofN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] arr = {1,3,4,2,2};
        int n = 5;
       
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i = 0; i < n;i++)
        {
            if(hm.containsKey(arr[i]))
            {
                System.out.println(arr[i]);
                break;
            }
            else
                hm.put(arr[i],arr[i]);
        }    
        
    }
    
}
