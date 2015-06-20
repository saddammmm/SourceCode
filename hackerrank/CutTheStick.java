/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author shussain
 */
public class CutTheStick {
    public static void main(String []args)
    {
        int s,t,n,l,r=0;
        ArrayList<Integer>A=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        s=sc.nextInt();
        n=sc.nextInt();
        l=sc.nextInt();
        for (int i = 0; i <n; i++) {
            A.add(sc.nextInt());
        }
        for (int i = 0; i < 10; i++) {
            
        }
    }
    public static boolean Gd(int a,int b,int n,int l)
    {
        boolean t=false;
        for (int i = 0; i <2; i++) {
            if(a>l)
            {t=true;
            break;}
            a=b-a;
            b=n;
        }
        return t;
    }
    
}
