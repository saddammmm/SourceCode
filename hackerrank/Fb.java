/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Saddam
 */
public class Fb {
    public static void main(String args[])throws IOException
    {
        int t;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        t=Integer.parseInt(br.readLine());
        for(int h=1;h<=t;h++)
        {
            int n,loc1=0,loc2=0;
        n=Integer.parseInt(br.readLine());
        
        int len = Integer.toString(n).length();
        int f=len-1;
        ArrayList<Integer> p=new ArrayList<>();
        //ArrayList<Integer> q=new ArrayList<>();
        for(int i=0;i<len;i++)
        {
            int firstDigit = Integer.parseInt(Integer.toString(n).substring(i, i+1));
            p.add(firstDigit);
            
        }
       
        
        int g=p.get(0);
        int k=p.get(0);
        for(int i=1;i<len;i++)
        {    
           if(g<p.get(i))
           {
               
                loc1=i;
                g=p.get(loc1);
                
           }
           if(k>p.get(i)&&p.get(i)!=0)
           {
               loc2=i;
               k=p.get(loc2);
           }
           
        } 
        Collections.swap(p, 0, loc2);
            System.out.print("Case"+" "+"#"+h +":");
        for(int i=0;i<len;i++)
        {
            System.out.print(p.get(i));
        }
            Collections.swap(p, loc2, 0);
            Collections.swap(p, 0, loc1);
            System.out.print(" ");
            for(int i=0;i<len;i++)
        {
            System.out.print(+p.get(i));
        }
            System.out.print("\n");
        }
              //Collections.swap(p, 0, loc);
           /* for(int i=1;i<len;i++)
        {
          
           if(p.get(0)>p.get(i)&&p.get(i)!=0)
           {
               Collections.swap(p, 0, i);
               
               
           }
            
        }
        System.out.println(p);*/
    }
}
