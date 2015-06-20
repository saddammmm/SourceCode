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
public class cUT {
    
    public  static void main(String args[])
    {
        int t;
        String l,b;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        sc.nextLine();
        while(t>0){
        l=sc.next();
        
        b=sc.next();
        int s=0;
        if(Integer.parseInt(l)>=Integer.parseInt(b)){
        for (int i = 0; i <l.length(); i++) {
            s+=Integer.parseInt(l.substring(i, i+1));
        }
       if(s%3==0)
            System.out.println("YES");
       else
            System.out.println("NO"+" "+((Integer.parseInt(l)%3)*(Integer.parseInt(b)))%3);
        }
        else
        {
            for (int i = 0; i <b.length(); i++) {
            s+=Integer.parseInt(b.substring(i, i+1));
        }
       if(s%3==0)
            System.out.println("YES");
       else
            System.out.println("NO"+" "+((Integer.parseInt(b)%3)*(Integer.parseInt(b)))%3);
        }
         t--;}
            
       }
       
    
}
