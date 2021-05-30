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
public class MajorityElement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        //Moore's Voting Algorithm 
        int N = 5; 
        int A[] = {3,1,3,3,2}; 
        int index = findMajorityCandidate(A,N);
        if(checkMajority(A,N,index))
            System.out.println(index);
        else
            System.out.println("-1");
        
        
        
        
        
    }
    static int findMajorityCandidate(int[] A, int N)
    {
        int major_index = 0,count =1;
        for(int i = 1; i < N; i++)
        {
            if(A[i]== A[major_index])
                count++;
            else
                count--;
            if(count == 0)
            {
                major_index = i;
                count = 1;
            }
        }
        return A[major_index];
    }
    
    static boolean checkMajority(int[] A, int N , int index)
    {
        int count = 0;
        for(int i = 0; i < N; i++)
        {
            if(A[i] == index)
                count++;
        }
        if(count > N/2)
            return true;
        else
            return false;
    }
    
}
