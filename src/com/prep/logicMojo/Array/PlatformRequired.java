/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prep.logicMojo.Array;

import java.util.Arrays;

/**
 *
 * @author lpt-2188
 */
public class PlatformRequired {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arrival = { 100, 140, 150, 200, 215, 400 };
        int[] departure = {110, 300, 220, 230, 315, 600};
        
        Arrays.sort(departure);
        int i = 0, j = 1;
        int max_platform = Integer.MIN_VALUE;
        int platform =1;
        while(j < arrival.length && i < departure.length)
        {
            if(departure[i] > arrival[j])
            {
                platform++;
                if(max_platform < platform)
                    max_platform = platform;
               
            }
             i++;
             j++;
        }
        System.out.println(max_platform);
    }
    
}
