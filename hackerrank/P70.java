/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

/**
 *
 * @author shussain
 */
import java.util.Arrays;
import java.util.Scanner;


public  class P70  {
	
	public static void main(String[] args) {
            int n;
            Scanner sc=new Scanner(System.in);
            n=sc.nextInt();
		System.out.println(new P70().run( n));
	}
	
	
	//private static final int LIMIT = pow(10, 7);
	
	public String run(int LIMIT) {
		int minNumer = 1;  // Initially infinity
		int minDenom = 0;
		int[] totients = listTotients(LIMIT - 1);
		for (int n = 2; n < totients.length; n++) {
			int tot = totients[n];
			if ((long)n * minDenom < (long)minNumer * tot && hasSameDigits(n, tot)) {
				minNumer = n;
				minDenom = tot;
			}
		}
		if (minDenom == 0)
			throw new RuntimeException("Not found");
		return Integer.toString(minNumer);
	}
	
	
	private static boolean hasSameDigits(int x, int y) {
		char[] xdigits = Integer.toString(x).toCharArray();
		char[] ydigits = Integer.toString(y).toCharArray();
		Arrays.sort(xdigits);
		Arrays.sort(ydigits);
		return Arrays.equals(xdigits, ydigits);
	}
        public static int pow(int x, int y) {
		if (y < 0)
			throw new IllegalArgumentException("Negative exponent");
		int z = 1;
		for (int i = 0; i < y; i++) {
			if (Integer.MAX_VALUE / z < x)
				throw new ArithmeticException("Overflow");
			z *= x;
		}
		return z;
	}
        	public static int[] listTotients(int n) {
		if (n < 0)
			throw new IllegalArgumentException("Negative size");
		int[] totients = new int[n + 1];
		for (int i = 0; i <= n; i++)
			totients[i] = i;
		
		for (int i = 2; i <= n; i++) {
			if (totients[i] == i) {  // i is prime
				for (int j = i; j <= n; j += i)
					totients[j] = totients[j] / i * (i - 1);
			}
		}
		return totients;
	}
	
}
