/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.Scanner;

/**
 *
 * @author Saddam
 */
public class ASW {
    public static void main(String args[])
    {
        int n,m,x=0,y=0,xi=0,yj=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        sc.nextLine();
        int count=0;
        String[]F=new String[n];
        for (int i = 0; i < n; i++) {
            F[i]=sc.nextLine();
        }
        
       for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(F[i].charAt(j)=='S')
                {  x=i;
                y=j;}
            }
        }
         for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(F[i].charAt(j)=='E')
                { xi=i;
                yj=j;}
            }
        }
         for (int i = x; i <= xi; i++) {
             for (int j = y+1; j < m; j++) {
                 if(F[i].charAt(j)==' '||F[i].charAt(j-2)==' ')
                    count++;
                 
                     }
             if(count>0) continue;
             else break;
             
        }
         
         if(count>0)
         System.out.println(count+1);
         else
             System.out.println("-1");
    }
}
