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
public class PackMan {
    public static void main(String []args)
    {
        Scanner sc=new  Scanner(System.in);
        int r,s,r1,s1,n,m;
 r=sc.nextInt();
  s=sc.nextInt();
   r1=sc.nextInt();
    s1=sc.nextInt();
     n=sc.nextInt();
      m=sc.nextInt();
       String[]g=new String[n];
               
        for(int i = 0; i < r; i++) {
            g[i] = sc.next();
        }
        
    }
}
