/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2blog.string;

import java.util.HashMap;

/**
 *
 * @author lpt-2188
 */
public class UniqueCharacterString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str = "abc";
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        boolean flag = true;
        for(int i = 0 ; i < str.length(); i++)
        {
            int count = 0;
            if(hm.containsKey(str.charAt(i)))
            {
                hm.put(str.charAt(i),hm.get(str.charAt(i))+1);
                flag = false;
                break;
            }
            else
            {
                hm.put(str.charAt(i), count+1);
            }    
        }    
        
        System.out.println(flag);
    }
    
}
