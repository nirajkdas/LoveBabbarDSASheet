/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2blog.string;

import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author lpt-2188
 */
public class AnagramString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s1 = "Angel";
        String s2 = "Angle";
        char[] c1 = s1.toLowerCase().toCharArray();
        Arrays.sort(c1);
        char[] c2 = s2.toLowerCase().toCharArray();
        Arrays.sort(c2);
        System.out.println(String.valueOf(c2).equals(String.valueOf(c1)));
        
    }
    
}
