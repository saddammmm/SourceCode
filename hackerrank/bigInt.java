package hackerrank;

import java.math.*;

public class bigInt {

public static void main(String[] args) {

       // create 3 BigInteger objects
	BigInteger bi1, bi2, bi3;  

	// assign values to bi1, bi2
	bi1 = new BigInteger("1230000000000000000000000000");
	bi2 = new BigInteger("50");

	// perform add operation on bi1 using bi2
	bi3 = bi1.add(bi2);
	  
	String str = "Result of addition is " +bi3;;

	// print bi3 value
	System.out.println( str );
    }
}