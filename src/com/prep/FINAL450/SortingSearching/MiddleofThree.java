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
public class MiddleofThree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        int A = 978, B = 518, C = 300;
        
        
        int x = A-B;
        int y = B-C;
        int z = A-C;
        
        if(x*y > 0)
        {
            System.out.println(B);
            return;
        }
        if(x*z > 0)
        {
            System.out.println(C);
            return;
        }
        else
        {
            System.out.println(A);
        }
        
    }
    
}
