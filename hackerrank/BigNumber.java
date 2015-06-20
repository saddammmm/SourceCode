/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import com.sun.xml.internal.ws.util.StringUtils;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author shussain
 */
public class BigNumber {
    public static void main(String []args)
    {
        int t;
        BigInteger A,N,M;
        String a,r="";
       
        Scanner sc=new Scanner(System.in);
   t=sc.nextInt();
   while(t>0){
         a=sc.next();
        //A=sc.nextBigInteger();
        N=sc.nextBigInteger();
        M=sc.nextBigInteger();
        if(N.compareTo(BigInteger.valueOf(2147483647))<=0)
        { 
            r= r.concat(new String(new char[N.intValue()]).replace("\0", a));}
        else
        {
            for (BigInteger i = BigInteger.valueOf(2147483647); i.compareTo(N)<0; i=i.add(BigInteger.ONE)) {
            r= r.concat(new String(new char[i.intValue()]).replace("\0", a));
        }
        }
 BigInteger b=new BigInteger(r);
        System.out.println(b);
        System.out.println(b.mod(M));
   t--;r="";}
    }
    
}
