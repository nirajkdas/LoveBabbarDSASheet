/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2blog.string;

/**
 *
 * @author lpt-2188
 */
public class StringRotation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s1 = "java2blog";
        String s2 = "blogjava2";
        
        String s3 = s2+s2;
        System.out.println(s3.contains(s1));
    }
    
}
