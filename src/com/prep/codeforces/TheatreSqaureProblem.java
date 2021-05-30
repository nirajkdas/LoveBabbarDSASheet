/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prep.codeforces;

import java.util.Scanner;

/**
 *
 * @author lpt-2188
 */
public class TheatreSqaureProblem {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        long n = sc.nextInt();
        long m = sc.nextInt();
        long a = sc.nextInt();
        
        long countn = n/a;
        long countm = m/a;
        
        if(n%a != 0)
            ++countn;
        if(m%a != 0)
            ++countm;
        
        System.out.println(countn*countm);
    }
    
}
