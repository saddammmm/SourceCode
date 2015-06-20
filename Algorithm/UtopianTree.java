/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithm;

import java.util.Scanner;

/**
 *
 * @author shussain
 */
public class UtopianTree {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int t,n;
        t=sc.nextInt();
        while(t>0){
        n=sc.nextInt();
        int res=2,i=0;
        if(n==1)
            System.out.println("2");
         if(n==0)
            System.out.println("1");
        if(n>2)
        {
            for (i = 2; i <=n; i++) {
            if(i%2!=0)
                res+=res;
            if(i%2==0)
                res+=1;
        }
            System.out.println(res);
        }
        t--;}
    }
    
}
