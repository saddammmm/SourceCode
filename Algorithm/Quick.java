/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Saddam
 */
class Quic{
     public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        ArrayList<Integer>S=new ArrayList<>();
        ArrayList<Integer>L=new ArrayList<>();
        ArrayList<Integer>H=new ArrayList<>();
        for (int i = 0; i <n; i++) {
            S.add(sc.nextInt());
            
        }
       
        int p=Partition(S, 0, n-1);
       // Collections.swap(S, 0, p);
        
        for (int i = 1; i <=p; i++) {
            if(S.get(0)<S.get(i))
            H.add(S.get(i));
            else
                L.add(S.get(i));
        }
        for (int i = p+1; i <n; i++) {
            if(S.get(0)>S.get(i))
                L.add(S.get(i));
            else 
                H.add(S.get(i));
        }
        ArrayList<Integer>Com=new ArrayList<>();
        Com.addAll(L);
        Com.add(S.get(0));
        Com.addAll(H);
        for (int i = 0; i <n; i++) {
             System.out.print(Com.get(i)+" ");
        }
       
       
    }
    public static int Partition(ArrayList<Integer>A,int s,int e)
    {
        int x=A.get(s);
       
        int i=s-1;//index of smaller element
        for (int j = s; j <=e-1; j++) {
            if(A.get(j)<=x)
            {  i++;
                
            }
            }
        
           
            return i+1;
        }
  
    }

