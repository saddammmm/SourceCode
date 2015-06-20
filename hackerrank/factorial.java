package hackerrank;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
 
/***
 * @author wgpshashank
 * /
 
/* Name of the class has to be "Main" only if the class is public. */
class FacorialOfBigNuumber
{
        public static void main (String[] args) throws java.lang.Exception
        {
                 BigInteger fact= BigInteger.ONE;
	             int factorialNo = 10000;
 
		    for (int i = 2; i <= factorialNo; i++){
		      fact = fact.multiply(new BigInteger(String.valueOf(i)));
		    }
 
    System.out.println("The factorial of " + factorialNo +
                                " (or " + factorialNo + "!) is: " + fact);
         }
}