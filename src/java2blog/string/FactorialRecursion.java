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
public class FactorialRecursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int n = 5;
        int product = factorial(n);
        System.out.println(product);
    }
    static int factorial(int n)
    {
        if(n == 1)
            return 1;
        return n * factorial(n-1);
    }
}
