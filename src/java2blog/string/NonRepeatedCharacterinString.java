/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2blog.string;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

/**
 *
 * @author lpt-2188
 */
public class NonRepeatedCharacterinString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s1 = "java2blog";
        LinkedHashMap<Character,Integer> hm = new LinkedHashMap<Character,Integer>();
        for(int i = 0; i < s1.length(); i++)
        {
            int count = 0;
            if(hm.containsKey(s1.charAt(i)))
            {
                hm.put(s1.charAt(i),hm.get(s1.charAt(i))+1);
            }
            else
            {
                hm.put(s1.charAt(i), count+1);
            }    
        } 
        
        for(Entry<Character,Integer> entry : hm.entrySet())
        {
            int val = entry.getValue();
            if(val == 1)
            {
                Character c = entry.getKey();
                System.out.println(c);
                break;
            }    
        }    
        
        
        
    }
    
}
