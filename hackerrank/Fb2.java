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
 
class Fb2{
    public static boolean isSubset(int set[][],int n,int[] sum)
    {   
        if((sum[0]==0)&&(sum[1]==0&&sum[2]==0))
           return true;
    for(int i=0;i<3;i++)
       if(n==0&&sum[i]!=0)
           return false;
            for (int j = 0; j < 3; j++) 
                if(set[n-1][j]>sum[j])
                    return isSubset(set, n-1, sum);
                  
                    
                        for(int j=0;j<3;j++)
                        {
                            sum[j]=sum[j]-set[n-1][j];
                    }
            return isSubset(set, n-1, sum)||isSubset(set, n-1, sum);
            
        
    }
    
    
    public static void main(String ars[])
    {
        int n,t;
        
       Scanner sc=new Scanner(System.in);
        
        t=sc.nextInt();
       int[]gff=new int[3];
        for(int k=1;k<=t;k++)
        {
        
        for(int i=0;i<3;i++)
        {
            gff[i]=sc.nextInt();
        }
        n=sc.nextInt();
        int[][]ff=new int[n][3];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<3;j++)
            {
            ff[i][j]=sc.nextInt();
            }
        }
       if(isSubset(ff, n, gff)==true)
       {
           System.out.println("Case"+" "+"#"+k+"yes");
       }
       else
       {
           System.out.println("Case"+" "+"#"+k+"no");
       }
    
        }
    }
       
        
        
    
}
