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
public class SD {
    public static void main(String args[])
    {
      BigInteger n;
      int c;
        Scanner sc=new Scanner(System.in);
      n=sc.nextBigInteger();
        BigInteger e=new BigInteger("3");
        
        c=sc.nextInt();
        
        int qq=0;
        for (BigInteger i = ini(count(n)); i.compareTo(ma(count(n))) <=0; i=i.add(BigInteger.ONE)) {
            if(i.mod(e).compareTo(BigInteger.ZERO)==0)
                if(weight(i, n)<=c)
                    qq++;
        }
        
        System.out.println(qq);
    }
    public static int count(BigInteger m)
    { 
        int dig=0;
        while(m.compareTo(BigInteger.ZERO)>0)
        {
           m=m.divide(BigInteger.valueOf(10));
           dig++;
           
    }return dig;
        }
        

    public static int weight(BigInteger j,BigInteger k)
    {
        String ori;
        String ne;
        ori=j.toString();
        ne=k.toString();
        //BigInteger u=BigInteger.ZERO;
        int u=0;
        for (int i = 0; i < count(k); i++) {
            u+=Math.abs(ori.charAt(i)-ne.charAt(i));
            //System.out.println(u);
        }
        return u;
    }
    public static BigInteger ini(int x)
    {  
        BigInteger h=BigInteger.ONE;
        while(--x!=0)
        {
            h=h.multiply(BigInteger.TEN);
            
        }
        return h;
    }
    public static BigInteger ma(int x)
    {
        BigInteger m=BigInteger.ZERO;
        while(x--!=0)
        {
            m=m.multiply(BigInteger.TEN).add(BigInteger.valueOf(9));
        }
        return m;
    }
}
