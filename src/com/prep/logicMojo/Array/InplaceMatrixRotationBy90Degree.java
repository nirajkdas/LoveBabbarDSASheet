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
public class InplaceMatrixRotationBy90Degree {

    /**
     * @param args the command line arguments
     */
    static int N = 4; 
    public static void main(String[] args) {
        // TODO code application logic here
           int matrix[][] = { { 1, 2, 3, 4 }, 
                      { 5, 6, 7, 8 }, 
                      { 9, 10, 11, 12 }, 
                      { 13, 14, 15, 16 } }; 
    matrixRotation(matrix); 
    printMatrix(matrix); 
    }
    static void printMatrix(int matrix[][]) 
{ 
    for (int i = 0; i < N; i++) 
    { 
        for (int j = 0; j < N; j++) 
        System.out.print( matrix[i][j] + " "); 
        System.out.println(); 
    } 
}
    
    
    static void matrixRotation(int[][] matrix)
    {
        for(int i = 0; i < N/2; i++)
        {
            for(int j = i; j < N-i-1; j++)
            {
               int temp = matrix[j][N - 1 - i]; 
            //swap top right from [x][y] starting cordinate 
            matrix[j][N - 1 - i] = matrix[i][j]; 
            //Move values from bottom left to [x][y]
            matrix[i][j] = matrix[N - 1 - j][i]; 
            //Move values from bottom right to bottom left
            matrix[N - 1 - j][i] = matrix[N - 1 - i][N - 1 - j]; 
            //store the temp value in bottom right
            matrix[N - 1 - i][N - 1 - j] = temp; 
                
                
            }
        }
    }
}
/*

13 9 5 1 
14 10 6 2 
15 11 7 3 
16 12 8 4 


*/