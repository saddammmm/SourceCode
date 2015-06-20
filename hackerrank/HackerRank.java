/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Saddam
 */
public class HackerRank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BigInteger b,w,x,y,z,r1,r2,r3,r;
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
        b=sc.nextBigInteger();
        w=sc.nextBigInteger();
        x=sc.nextBigInteger();
        y=sc.nextBigInteger();
        z=sc.nextBigInteger();
        
        r1=x.multiply(b).add(w.multiply(y));
        r2=y.multiply(b).add(y.multiply(w)).add(b.multiply(z));
        r3=x.multiply(w).add(x.multiply(b)).add(w.multiply(z));
        r=r1.min(r2.min(r3));
        System.out.println(r);
        }
    }
}
