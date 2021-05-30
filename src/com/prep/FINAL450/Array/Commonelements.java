/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prep.FINAL450.Array;

import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author lpt-2188
 */
public class Commonelements {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int n1 = 6; int[] A = {1, 5, 10, 20, 40, 80};
        int n2 = 5; int[] B = {6, 7, 20, 80, 100};
        int n3 = 8; int[] C = {3, 4, 15, 20, 30, 70, 80, 120};
        
        
        
       HashSet<Integer> hs = new HashSet<Integer>();
       HashSet<Integer> hs1 = new HashSet<Integer>();
       ArrayList<Integer> arrtemp = new ArrayList<Integer>();
       ArrayList<Integer> arrresult = new ArrayList<Integer>();
       for(int i = 0; i < n1; i++)
       {
           hs.add(A[i]);
       }
       for(int i = 0; i < n2; i++)
       {
           if(hs.contains(B[i]))
           {
           arrtemp.add(B[i]);
           hs1.add(B[i]);
           }
       }
       for(int i = 0; i < n3; i++)
       {
           if(hs1.contains(C[i]))
           {
               arrresult.add(C[i]);
           }
       }
        
        for(int i = 0;i < arrresult.size();i++)
        {
            System.out.println(arrresult.get(i));
        }
        
        
    }
    
}
