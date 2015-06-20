/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author shussain
 */
public class A {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int t;
        BigInteger n;
        t=sc.nextInt();
        for (int r = 0; r< t; r++) {
            
        n=sc.nextBigInteger();
        
            System.out.println(factorial(n));
        }
                
        
    }
   public static BigInteger factorial(BigInteger n) {
		
			
		BigInteger prod = BigInteger.ONE;
		for (BigInteger i = BigInteger.valueOf(2); i.compareTo(n)<=0; i=i.add(BigInteger.ONE))
			prod = prod.multiply(i);
		return BigInteger.valueOf(prod.toString().length());
                        
	}
}
