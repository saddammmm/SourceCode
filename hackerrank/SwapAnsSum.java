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
 * @author Saddam
 */
public class SwapAnsSum {
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,t,sum,g,o,m,q;
        n=sc.nextInt();
        t=sc.nextInt();
        int[][] oper=new int[t][3];
        ArrayList<Integer> seq=new ArrayList<>(n);
        for(int i=1;i<=n;i++)
        {
            seq.add(sc.nextInt());
            
        }
         for(int i=0;i<t;i++)
        {
            for(int j=0;j<3;j++)
            {
                oper[i][j]=sc.nextInt();
            }
        }
         
         
        for(int l=0;l<t;l++)
        {  
            // int sum=0;
           
            
               if(oper[l][0]==1)
               {   //if((oper[l][2]-oper[l][1]+1)%2==0){
                     m=seq.indexOf(oper[l][1]);
                      q=seq.indexOf(oper[l][2]);
                      for(int w=m;w<q-1;w++,q--){
                     Collections.swap(seq, w, ++w);
                      Collections.swap(seq, q, --q);
                      }
               }
               
              // System.out.println(seq.get(l));
               
               
               if(oper[l][0]==2)
               {   sum=0;
                    g=oper[l][1];
                    o=oper[l][2];
                  
               for( int d=g-1;d<=o-1;d++)
            {
                int a=seq.get(d);
                sum+=a;
                
            }
                  System.out.println(sum);    
               }
               
           
        }
        
    }
}
