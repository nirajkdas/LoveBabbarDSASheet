package com.prep.codeforces;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author lpt-2188
 */
public class WaterMelon {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        int weight ;
        
        weight = sc.nextInt();
       
            if(weight > 2 && weight % 2 == 0)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }    
       
    }
    
}
