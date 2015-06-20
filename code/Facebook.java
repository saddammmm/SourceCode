/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author Saddam
 */
public class Facebook {
    
   
    public static void main(String args[])
    {
        
        
        int n,m,sl1=0,sl2=0,ld1=0,ld2=0,opt_cost=0; 
int dfi=0,dbi=0,dui=0,ddi=0,dfj=0,dbj=0,duj=0,ddj=0;
        Scanner sc=new Scanner(System.in);
        m=sc.nextInt();
        n=sc.nextInt();
        sc.nextLine();
        String[] k=new String[m];
        for (int i = 0; i < m; i++) {
            k[i]=sc.nextLine();
        }
        int [][]cost=new int[m][n];
        for (int i = 0; i < m; i++) 
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
            cost[i][j]=2;
        }
        if(k[i].charAt(j)=='.')
        {
            
            cost[i][j]=0;
        }
        if(k[i].charAt(j)=='^')
        {
            dui=i;
            duj=j;
            
            
        }
        if(k[i].charAt(j)=='>')
        {
            dfi=i;
            dfj=j;
           
            
        }
        if(k[i].charAt(j)=='v')
        {
            ddi=i;
            ddj=j;
            
           
        }
        if(k[i].charAt(j)=='<')
        {
            dbi=i;
            dbj=j;
        
           
        }
        if(k[i].charAt(j)=='#')
        {
            /*ld1=i;
            ld2=j;*/
            cost[i][j]=1;
        }
        
    }
}
        for (int i = dbj; i <=0; i--) {
            cost[dbi][i]=1;
        }
        
        //System.out.println(dbi+""+dbj);
        
       // cost[dbi][0]=1;
        //System.out.println(cost[dbi][0]);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(cost[i][j]);
            }
            System.out.print("\n");
        }
        
       
        if(thereisPath(sl1,sl2, cost,m,n)){
            System.out.println("yes");}
          else
        {
            System.out.println("Imposible");}
       
    }
     public static boolean thereisPath(int curx,int cury,int[][]arr,int m,int n)
    {  int count=0;
        Queue<Integer>q=new LinkedList<>();
        List<String>ll=new ArrayList<>();
        q.add(cury);
        q.add(curx);
        int dx[]={1,-1,0,0}; int dy[]={0,0,1,-1};
        //int dx[]={0,0,-1,-1,-1,1,1,1};
        //int dy[]={-1,1,-1,0,1,-1,0,1};
        ll.add(curx+" "+cury);
        while(!q.isEmpty())
        {   
            int y=q.poll();
            int x=q.poll();
            
            for (int i = 0; i < 4; i++) {
                int xx=x+dx[i];
                int yy=y+dy[i];
                if(xx>=0&&yy>=0&&xx<m&&yy<n)
                { 
                    if(ll.indexOf(xx+" "+yy)<0&&(arr[xx][yy]==0||arr[xx][yy]==2))
                    {   
                        //System.out.println(xx+" "+yy);
                                               
                        
                        if(arr[xx][yy]==2)
                        return true;
                        q.add(yy);
                        q.add(xx);
                        count++;
                        ll.add(xx+" "+yy);
                    }
                }
                }  
            
               
    }
        //System.out.println("");  
    return false;
             
    }
}
