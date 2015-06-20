/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author shussain
 */
public class RoyAndMatrixSum {
    public static void main(String []args)
    {
        int t;
        Scanner sc=new Scanner(System.in);
       
        t=sc.nextInt();
        while(t>0)
        {
        BigInteger re=BigInteger.ZERO,n;
        n=sc.nextBigInteger();
        for (BigInteger i = n; i.compareTo(BigInteger.ZERO)>=0; i=i.subtract(BigInteger.ONE)) {
            re=re.add(i.multiply(i.subtract(BigInteger.ONE)).divide(BigInteger.valueOf(2)));
        }
        System.out.println(re.multiply(BigInteger.valueOf(2)));
        t--;}
    }
    
}
