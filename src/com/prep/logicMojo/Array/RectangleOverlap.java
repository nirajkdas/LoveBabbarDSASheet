/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prep.logicMojo.Array;

/**
 *
 * @author lpt-2188
 */
public class RectangleOverlap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int [] rec1 = {0,0,2,2};int[] rec2 = {1,1,3,3};
        if(rec1[0] >=  rec2[2] || rec2[0] >= rec1[2])
        {    
           System.out.println("false");
            return;
        }
        if(rec2[3] > rec1[1] || rec1[3] > rec2[1])
        {    System.out.println("false");
            return;
        }
       System.out.println("true");
            
    }
    
}
