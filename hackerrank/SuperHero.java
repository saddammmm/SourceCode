/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.Scanner;

/**
 *
 * @author Saddam
 */
public class SuperHero {
    
    public static void main(String args[])
    {
        int test;
        Scanner sc=new Scanner(System.in);
        test=sc.nextInt();
        for(int m=0;m<test;m++){
            int l,n,cur=0,minp=0,loc=0,opt=0;
        l=sc.nextInt();
        n=sc.nextInt();
        int[][]pow=new int[l][n];
        int[][]bullet=new int[l][n];
        for(int i=0;i<l;i++)
        {
            for(int j=0;j<n;j++)
            {
                pow[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<l;i++)
        {
            for(int j=0;j<n;j++)
            {
                bullet[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<l;i++)
        {
            
            //int j=0;
                minp=pow[i][0];
                for(int k=1,j=0;k<n;k++,j++)
                {
                if(minp>=pow[i][k])
                {   
                    if(minp==pow[i][k])
                {
                    if(bullet[i][j]<bullet[i][k])
                    {
                        minp=pow[i][k];
                        loc=k+1;
                    }
                    
                }
                    else{
                        minp=pow[i][j];
                    loc=j;  
                    }
                }
                
                }
                if(cur<minp)
                {
                    opt+=minp-cur;
                }
                
                    cur=bullet[i][loc];
            
        }
        System.out.println(opt);
        }
        
    }
}
