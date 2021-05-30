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
public class SpiralMatrixPrint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int R = 4; 
        int C = 4; 
        int matrix[][] = { { 1, 2, 3, 4},
                      {5,6,7,8},
                      { 9, 10, 11, 12}, 
                      { 13, 14, 15, 16 } }; 
        
       int i = 0,j = R - 1,k=0,l = C-1;
        
        while(i < j && k < l)
        {
            for(int x = k; x < l; x++)
                System.out.print(matrix[i][x]+" ");
            for(int x = i; x < j ;x++)
                System.out.print(matrix[x][l]+" ");
            for(int x = l; x > k; x--)
                System.out.print(matrix[j][x]+" ");
            for(int x = j ; x > i; x--)
                System.out.print(matrix[x][k]+" ");
            i++;
            j--;
           k++;
           l--;
        }
        
        
        
        
        
    }
    
}
