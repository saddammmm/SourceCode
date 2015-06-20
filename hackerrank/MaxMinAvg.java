/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author shussain
 */
public class MaxMinAvg {
    public static void main(String[]args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        ArrayList<Integer>A=new ArrayList<>();
        for (int i = 0; i <n; i++) {
            A.add(sc.nextInt());
        }
        Collections.sort(A);
       int a=0,b=0;
        for (int i = 0; i <n/2; i++) {
            a+=A.get(i);
        }
        for (int i = n/2; i <n; i++) {
            b+=A.get(i);
        }
        int r=n/2;
        System.out.println(Math.ceil((b-a)/r));
    }
    
}
