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
public class ReverseString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String revstr = "Reversethis";
        //for loop 
        String resultstr = "";
        for(int i = revstr.length()-1; i >= 0 ;i--)
        {
            resultstr = resultstr+revstr.charAt(i);
        }
        System.out.println(resultstr);
        resultstr = "";
        //recursion 
        resultstr = reversestrrecussion(revstr);
        System.out.println(resultstr);
        
        //StringBuffer 
        StringBuffer strbuffer = new StringBuffer(revstr);
        System.out.println(strbuffer.reverse());
    }
    public static String reversestrrecussion(String str)
    {
        if(str.length() == 1)
            return str;
        else
            return str.charAt(str.length() -1)+reversestrrecussion(str.substring(0,str.length()-1));
    }        
}
