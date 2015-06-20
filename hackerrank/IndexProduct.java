/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author shussain
 */
public class IndexProduct {
     public static void main(String []args)
    {
        int t;
        BigInteger re=BigInteger.ZERO;
       
        Scanner scanner=new Scanner(System.in);
        ArrayList<BigInteger>L=new ArrayList<>();
         ArrayList<BigInteger>M=new ArrayList<>();
        int n;
        n=scanner.nextInt();
        for (int i = 0; i <n; i++) {
            L.add(scanner.nextBigInteger());
        }
        
        
       for (int i = 0; i<n; i++) {
           M.add(Right(L, L.get(i)).multiply(Left(L, L.get(i))));
        }
       Collections.sort(M);
        System.out.println(M.get(n-1));
    }
    public static BigInteger Right(ArrayList<BigInteger>L,BigInteger a)
    {
        BigInteger u=BigInteger.ZERO;
        for (int i = L.indexOf(a)+1; i <L.size(); i++) {
            if(L.get(i).compareTo(a)>0)
            {
                u=BigInteger.valueOf(i+1);
                break;
            }
            else
                u=BigInteger.ZERO;
        }
        
        return u;
    }
    public static BigInteger Left(ArrayList<BigInteger>L,BigInteger a)
    {
        BigInteger u=BigInteger.ZERO;
        for (int i = L.indexOf(a); i>=0; i--) {
            if(L.get(i).compareTo(a)>0)
            {
                u=BigInteger.valueOf(i+1);
                break;
            }
            else
                u=BigInteger.ZERO;
        }
        
        return u;
    }
}
