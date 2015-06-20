/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author shussain
 */
public class Map {
    public static void main(String []args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        HashMap<String ,Integer>P=new HashMap<>();
        n=sc.nextInt();
   
        String s1;
        Integer p;
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            s1=sc.nextLine();
            
           // sc.nextLine();
            p=sc.nextInt();
            P.put(s1, p);
            
        }
        System.out.println(P);
        int ph;
        sc.nextLine();
       for (int i = 0; i <n; i++) {
           String s=sc.nextLine();
            if(P.get(s)!=null)
                System.out.println(s+"="+P.get(s));
            else
                System.out.println("Not found");
        }
    }
    
}
