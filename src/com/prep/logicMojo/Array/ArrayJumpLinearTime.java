/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prep.logicMojo.Array;

/**
 *
 * @author lpt-2188
 */
public class ArrayJumpLinearTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      int[]  A = {3,2,1,0,4};
      int a = A[0];
      int b = A[0];
      int jump = 1;
      for(int i = 1; i < A.length;i++)
      {
          if(a == 0)
          {    
              System.out.println("-1");
              return;
          }
          if(i == A.length-1)
          {
              System.out.println(jump);
              return;
          }
          a--;
          b--;
          if(A[i] > b)
          {
              b = A[i];
            //  jump++;
          }
          if(b == 0)
          {
              System.out.println(0);
              return;
          }
          if(a == 0)
          {
              jump++;
              a = b;
          }
      }
      System.out.println(jump);
    }
    
}
