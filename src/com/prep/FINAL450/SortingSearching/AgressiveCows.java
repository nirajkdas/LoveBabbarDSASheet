/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prep.FINAL450.SortingSearching;

import java.util.Arrays;

/**
 *
 * @author lpt-2188
 */
public class AgressiveCows {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int n = 5;
        int C = 3;
        
        int [] barn = {1,2,8,4,9};
        
        Arrays.sort(barn);
        
        int low = 1;
        int high = barn[n-1];
        int ans = -1;
        
        while(low <= high)
        {
            int mid = (high+low)/2;
            boolean result = check(mid,barn,C);
            if(result)
            {
                if(mid > ans)
                {    
                    ans = mid;
                }
                low = mid+1;
            }
            else
                
                high = mid-1;
                
        }
        
        System.out.println(ans);
        
        
    }
    static boolean check(int diff, int[] barn,int C)
    {
        int count = 1;
        int j = barn[0];
        for(int i = 1; i < barn.length; i++)
        {
            if(barn[i]- j >= diff)
            {
                j = barn[i];
                count++;
            }
            if(count == C)
            {
                return true;
            }
        }
        return false;
    }
}
