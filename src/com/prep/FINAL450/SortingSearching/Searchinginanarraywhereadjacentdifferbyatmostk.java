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
public class Searchinginanarraywhereadjacentdifferbyatmostk {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
          int  arr[] = {4, 5, 6, 7, 6};
          int  k = 1;
           int x = 6;
           
         
       //  int arr[] = {20, 40, 50, 70, 70, 60} ; 
       //  int k = 20;
       //  int x = 60;
         
         
           int low = 0;
           int high = arr.length;
           while(low < high)
           {
               if(arr[low] == x)
               {
                   System.out.println(low);
                   break;
               }
               
               low = low + Math.max(1, Math.abs(arr[low]
                                      - x) / k);
               
               
               
           }
        
        
    }
    
}
