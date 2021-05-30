/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prep.FINAL450.Array;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author lpt-2188
 */
public class FactorialOfLargeNumber {

    /**
     * @param args the command line arguments
     */
    /*public static void main(String[] args) {
      int res[] = new int[500];
 
        // Initialize result
        res[0] = 1;
        int res_size = 1;
        int n =100;
        // Apply simple factorial formula
        // n! = 1 * 2 * 3 * 4...*n
        for (int x = 2; x <= n; x++)
            res_size = multiply(x, res, res_size);
 
        System.out.println("Factorial of given number is ");
        for (int i = res_size - 1; i >= 0; i--)
            System.out.print(res[i]);
       
    }
    
    public static int multiply(int x, int res[], int res_size)
    {
        int carry = 0; // Initialize carry
 
        // One by one multiply n with individual
        // digits of res[]
        for (int i = 0; i < res_size; i++)
        {
            int prod = res[i] * x + carry;
            res[i] = prod % 10; // Store last digit of
                                // 'prod' in res[]
            carry = prod/10; // Put rest in carry
        }
 
        // Put carry in res and increase result size
        while (carry!=0)
        {
            res[res_size] = carry % 10;
            carry = carry / 10;
            res_size++;
        }
        return res_size;
    }        */
    
    
    public static void main(String[] args)
    {
        int n = 100;
        int[] result = new int[500];
        result[0] = 1;
        int res_size = 1;
        for(int i = 2; i <=n;i++)
            res_size = multiply(i,result,res_size);
        
        for(int i = res_size-1; i >=0;i--)
            System.out.println(result[i]);
        
        
        
    }
    
    static int multiply(int x, int[] result, int res_size)
    {
        int carry = 0;
        for(int i = 0; i < res_size; i++)
        {
            int prod = result[i]*x+carry;
            result[i] = prod%10;
            carry = prod/10;
        }
        while(carry != 0)
        {
            result[res_size] = carry%10;
            carry = carry/10;
            res_size++;
        }
        return res_size;
    }
}
