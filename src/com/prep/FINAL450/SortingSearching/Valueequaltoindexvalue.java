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
public class Valueequaltoindexvalue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int  N = 5;
       int Arr[] = {15, 2, 45, 12, 7};
       for(int i = 0; i < N; i++)
       {
           if(i+1 == Arr[i])
           {
               System.out.println(Arr[i]);
           }
       }
    }
    
}
