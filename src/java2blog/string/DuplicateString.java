/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2blog.string;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author lpt-2188
 */
public class DuplicateString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s1 = "java2blog";
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        for(int i = 0 ; i < s1.length(); i++)
        {
            int count = 0;
            if(hm.containsKey(s1.charAt(i)))
            {
                hm.put(s1.charAt(i),hm.get(s1.charAt(i))+1);
            }
            else
            {
                hm.put(s1.charAt(i),count+1);
            }    
        }    
        
       for(Map.Entry<Character,Integer> entry : hm.entrySet())
       {
           int val = entry.getValue();
           Character c = entry.getKey();
          if(val > 1)
          {
              System.out.println(c+"");
          }    
       }    
    }
    
}
