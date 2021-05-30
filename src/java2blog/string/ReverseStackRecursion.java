/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2blog.string;

import java.util.Stack;

/**
 *
 * @author lpt-2188
 */
public class ReverseStackRecursion {

    /**
     * @param args the command line arguments
     */
    static Stack<Character> st = new Stack<>();
    public static void main(String[] args) {
        // TODO code application logic here
        st.push('1');
        st.push('2');
        st.push('3');
        st.push('4');
        st.push('5');
        reverse();
        System.out.println(st);
    }
    static void reverse()
    {
         char c = st.pop();
        if(st.empty())
        {
             //st.push(c);
            return;
        }
           
        reverse();
        insert(c);
       
    }
    static void insert(char c)
    {
        if(st.empty())
        {
            st.push(c);
            return;
        }
        char c1 = st.pop();
        insert(c1);
    }
}
