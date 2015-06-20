/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.Scanner;

/**
 *
 * @author shussain
 */
public class FunnyString {
    public static void main(String []args)
    {
        int t;
        String s;
        Scanner scanner=new Scanner(System.in);
        t=scanner.nextInt();
        scanner.nextLine();
        while(t>0){
        s=scanner.nextLine();
        StringBuilder sb=new StringBuilder(s);
        StringBuilder s2;
        s2=sb.reverse();
        boolean tr=true;
        for (int i = 0; i <s.length()-1; i++) {
            if(Math.abs(s.charAt(i+1)-s.charAt(i))!=Math.abs(s2.charAt(i+1)-s2.charAt(i)))
            {tr=false;
                break;}
        }
        if(tr)
            System.out.println("Fnny");
        else
            System.out.println("Not Funny");
    t--;}
    }
    
}
