/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prep.logicMojo.Array;

import java.util.ArrayList;

/**
 *
 * @author lpt-2188
 */
public class StockBuyAndSellProblem {

 
  static class Result { 
    int buy, sell; 
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Unlimited Numbver of transactions allowed
        

        StockBuyAndSellProblem stock = new StockBuyAndSellProblem();
        int array[] = { 98, 178, 250, 300, 40, 540, 690 }; 
        int n = array.length; 
  
        stock.findProfit(array, n); 
    }
    
    
     void findProfit(int array[], int n) 
    { 
        ArrayList<Result> arr = new ArrayList<Result>();
        int count = 0,i;
        for( i = 0; i < array.length; i++)
        {
            Result rs = new Result();
            while(array[i+1] <= array[i] && i < n-1)
            {
                i++;
                //rs.buy = array[i];
            }
            if(i == n-1)
                break;
            rs.buy = i++;
            while((array[i] >= array[i-1]) && (i < n))
            {
               // rs.sell = array[i];
                i++;
            }
            rs.sell = i-1;
            count++;
            i--;
            arr.add(rs);
        }
         if (count == 0) 
            System.out.println("Profit Can't be Make"); 
        else
            for (int j = 0; j < count; j++) 
                System.out.println("Buy on day: " + arr.get(j).buy +"Sell on day : " + arr.get(j).sell); 
  
        return; 
        
    }
    
}
