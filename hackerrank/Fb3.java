/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Saddam
 */
public class Fb3 {   
    public static void direction(int p,int q,int r,int s)
    {
        p=2;
         q=8;
          r=6;
           s=4;
        
    }
    public static boolean movef(int[][]arr,int k,int l,int q,int r)
    {
        boolean t=false;
        for (int i =k; i <q ; i++) {
            t=false;
            for (int j = l; j < r; j++) {
                
                if(arr[i][j]!=4&&arr[i][j]!=8)
                {
                     t= true;
                }
            }
            
        }
        return t;
    }
public static boolean moved(int[][]arr,int k,int l,int q,int r)
{   boolean t=false;
    for (int i =k; i <q ; i++) {
            for (int j = l; j < r; j++) {
                  t=false;
                if(arr[i][j]!=8&&arr[i][j]!=4)
                {
                    t=true;
                }
            }
            
        }
        return t;
}
    public static void main(String args[]) throws IOException
    {
        
Fb3 obj=new Fb3();

int n,m,sl1=0,sl2=0,ld1=0,ld2=0,opt_cost=0; 
int dfi=0,dbi=0,dui=0,ddi=0,dfj=0,dbj=0,duj=0,ddj=0;
Scanner sc=new Scanner(System.in);
       

m=sc.nextInt();
n=sc.nextInt();
sc.nextLine();
int[][] cost=new int[m][n];
String []k=new String[m];
  
for(int  i=0;i<m;i++)
{ 
    
      
        k[i]=sc.nextLine();
    

}  
for(int i=0;i<m;i++)
{
    for (int j = 0; j <n; j++) {
        if(k[i].charAt(j)=='S')
        {
            sl1=i;
            sl2=j;
            cost[i][j]=5;
        }
        if(k[i].charAt(j)=='G')
        {
            ld1=i;
            ld2=j;
            cost[i][j]=0;
        }
        if(k[i].charAt(j)=='.')
        {
            /*ld1=i;
            ld2=j;*/
            cost[i][j]=0;
        }
        if(k[i].charAt(j)=='^')
        {
            dui=i;
            duj=j;
            cost[i][j]=8;
        }
        if(k[i].charAt(j)=='>')
        {
            dfi=i;
            dfj=j;
            cost[i][j]=6;
        }
        if(k[i].charAt(j)=='v')
        {
            ddi=i;
            ddj=j;
            cost[i][j]=2;
        }
        if(k[i].charAt(j)=='<')
        {
            dbi=i;
            dbj=j;
            cost[i][j]=4;
        }
        if(k[i].charAt(j)=='#')
        {
            /*ld1=i;
            ld2=j;*/
            cost[i][j]=33;
        }
        
    }
}
        /*for (int i = 0; i <m; i++) {
            for (int j = 0; j <n; j++) {
                System.out.print(cost[i][j]);
            }
            System.out.print("\n");
        }*/

int dp=sl1,dd=sl2;
for(int i=sl1;i<m;i++)
{          
    
        if(obj.moved(cost, sl1, sl2, m, n))
        {
            dp=dp+1;
            
            obj.direction(cost[dfi][dfj], cost[dbi][dbj], cost[dui][duj], cost[ddi][ddj]);
        }
        if(obj.movef(cost, sl1, sl2, m, n))
        {
            dd=dd+1;
             obj.direction(cost[dfi][dfj], cost[dbi][dbj], cost[dui][duj], cost[ddi][ddj]);
        }
    
    
        
    }
if(k[dp].charAt(dd)=='G')
{
    System.out.println("yes");
}
        else
{
    System.out.println("imposible");
   
    }
    }
}
