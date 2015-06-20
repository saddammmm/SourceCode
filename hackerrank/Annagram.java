/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Saddam
 */
public class Annagram {
    
    public static boolean isAnnagram(String w,String a)
    {
        if(w.length()!=a.length())
        {
            return false;
        }
     
        char[] chars=w.toCharArray();
        for(char c: chars)
        {
            int index=a.indexOf(c);
            if(index!=-1)
                a=a.substring(0, index)+a.substring(index+1, a.length());
            else {
    return false;
}
        }
            return a.isEmpty();
    }
    public static void main(String args[])throws IOException
    {
        Scanner sc=new Scanner(System.in);
        String str,ann;
        str=sc.nextLine();
        ann=sc.nextLine();
        Annagram i=new Annagram();
        boolean p=i.isAnnagram(str, ann);
        if(p)
            System.out.println("Annagram");
        else
            System.out.println("not");
    }
    
}
