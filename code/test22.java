/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

import java.util.Scanner;

/**
 *
 * @author shussain
 */
public class test22 {
    public static int counrZero(int []a,int c)
    {
        int count=1,m=0;
      while(a[c]!=1&&c>=0)
            {
            
                count++;
                c--;
               
        }
        return c;
    
    }
     public static void main(String[] args) {
        int t,n,m;
        Scanner sc=new Scanner(System.in);
        //t=sc.nextInt();
       n=sc.nextInt();
        m=sc.nextInt();
        int[]A=new int[n];
           for(int i=0;i<n;i++)
               {
               A[i]=sc.nextInt();
           }
       
             System.out.println(counrZero(A, 3));
         
         
     }
}