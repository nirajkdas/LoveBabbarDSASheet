/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prep.FINAL450.Array;

import java.util.HashMap;

/**
 *
 * @author lpt-2188
 */
public class ArraySubsetofanotherarray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a1[] = {1, 2, 3, 4, 5, 6};
        int a2[] = {1, 2, 4};
        
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        
        for(int i = 0; i < a1.length; i++)
        {
            if(!hm.containsKey(a1[i]))
                hm.put(a1[i], a1[i]);
        }
        for(int i = 0; i < a2.length; i++)
        {
            if(!hm.containsKey(a2[i]))
            { System.out.println("No");
                return;
            }
             //  break;
        }
        
        System.out.println("Yes");
    }
    
}
