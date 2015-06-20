package code;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Data {

    public static void main(String[] args) {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       Scanner sc=new Scanner(System.in);
        long  n;
        BigInteger b;
        int n1;
        n1=sc.nextInt();
        while(n1>0){
            b=sc.nextBigInteger();
            if(b.compareTo(BigInteger.valueOf(Long.MAX_VALUE))<=0){
            n=b.longValue();
        System.out.println(n+" "+ "can be fitted in:");
        if(n<=Byte.MAX_VALUE&&n>=Byte.MIN_VALUE)
            System.out.println("* byte");
        if(n<=Short.MAX_VALUE&&n>=Short.MIN_VALUE)
            System.out.println("* short");
        if(n<=Integer.MAX_VALUE&&n>=Integer.MIN_VALUE)
            System.out.println("* int");
        if(n<=Long.MAX_VALUE&&n>=Long.MIN_VALUE)
            System.out.println("* long");}
            else{ 
                 System.out.println(b+" "+ "can't be fitted anywhere.");}
        n1--;}
    }
}