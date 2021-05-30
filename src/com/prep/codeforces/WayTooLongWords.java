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
public class WayTooLongWords {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
         int len = Integer.parseInt(sc.nextLine());
       //String str = "initialization";
        while(len != 0)
        {
            String str = sc.nextLine();
            if(str.length() > 10)
            {
                    String res = str.substring(0,1)+ (str.length()-2)+""+ str.substring(str.length()-1,str.length());
                    System.out.println(res);
            }   
            else
            {
                System.out.println(str);
            }    
            len--;
        }    
    }
    
}
