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
public class MazeBoatr {
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        BigInteger n;
        
        n=sc.nextBigInteger();
        
    }
    public static BigInteger RN(BigInteger k)
    { 
        BigInteger x=new BigInteger("10");
         BigInteger r=BigInteger.ONE;
        if(k.compareTo(x)<=0){
            for (int i = 0; i <=k.intValue(); i++) {
                if(isPrime(i))
                   r=r.multiply((BigInteger.valueOf(i)));
            }
            if(k.compareTo(x)>0)
            {
                
            }
        }
        return null;
    }
   public static boolean isPrime(int x)
   {
       if (x < 0)
			throw new IllegalArgumentException("Negative number");
		if (x == 0 || x == 1)
			return false;
		else if (x == 2)
			return true;
		else {
			if (x % 2 == 0)
				return false;
			for (int i = 3, end = (int)Math.sqrt(x); i <= end; i += 2) {
				if (x % i == 0)
					return false;
			}
			return true;
		}
   }
}
