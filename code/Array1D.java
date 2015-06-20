package code;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Array1D{

    public static void main(String[] args) {
        int t,n,m;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
       while(t>0){ n=sc.nextInt();
        m=sc.nextInt();
        int[]A=new int[n];
           for(int i=0;i<n;i++)
               {
               A[i]=sc.nextInt();
           }
           int pos=0, d=0,z=0;
           for (int i = 0; i <n; i++) {
               if(A[i]==0)
                   pos++;
               if(A[i]==1)
               {
                   d=countone(A, i);
                   System.out.println(d);
                   if(d+1==m)
                       pos+=m;
                  /* if(d<m)
                   {
                       z=counrZero(A, i);
                      
                       if(z+d>m)
                           pos=pos-z+m;
                      
                       
                   }*/
               }
               
           }
           System.out.println(pos);
           if(pos>n-1)
               System.out.println("YES");
           else
               System.out.println("NO");
                  
                  t--;}
    }
    public static int countone(int []a,int cur)
        {
        int c=1,m=0;
      while(a[cur]!=0&&cur<=5)
            {
            
                c++;
                cur++;
               
        }
        return c;
    }
    public static int counrZero(int []a,int c)
    {
        int count=1,m=0;
      while(a[c]!=1&&c>=0)
            {
            
                count++;
                c--;
               
        }
        return c;
    
    }
}