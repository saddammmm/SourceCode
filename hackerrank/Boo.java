/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.Scanner;

/**
 *
 * @author shussain
 */
public class Boo {
    public static void main(String []args)
    {
        int t,n,r;
        Scanner sc=new Scanner(System.in);
        
        t=sc.nextInt();
        while(t>0){
            r=0;
        n=sc.nextInt();
        for (int i = 1; i <=n; i++) {
            if(i%n!=0&&n%i!=0)
                r++;
        }
           
        if(pri(r))
            System.out.println(r+"TRUE");
        else
            System.out.println(r+"FALSE");
        t--;
        }
    }
    public static boolean pri(int n)
    {
        boolean t=true;
        if(n==1||n==0)
            t=false;
        else if(n==2)
            t=true;
        else
        for (int i = 2; i <=Math.sqrt(n); i++) {
            if(n%i==0)
            {    t=false;
             break;}
            }
        return t;
        }
    }

