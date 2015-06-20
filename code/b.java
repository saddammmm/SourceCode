/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author shussain
 */
public class b {
    public static void main(String []args)
    {
        int n,q;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        q=sc.nextInt();
        BigInteger s1= BigInteger.ZERO;
        BigInteger s2= BigInteger.ZERO;
        ArrayList<BigInteger>A=new ArrayList<>();
        ArrayList<BigInteger>B=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            A.add(sc.nextBigInteger());
            
        }
         for (int i = 0; i < q; i++) {
            B.add(sc.nextBigInteger());
            
        }
         int[][]QQ=new int[q][3];
         for (int i = 0; i <q; i++) {
             for (int j = 0; j <3; j++) {
                 QQ[i][j]=sc.nextInt();
                 
             }
        }
         
        
         for (int i = 0; i < q; i++) {
           
            if(QQ[i][1]==1){
                for (int j = QQ[i][1]-1; j <QQ[i][2] ;j++) {
                    s1=s1.add(merge(A, B).get(j));
                
            }
             System.out.println(s1);
             s1=BigInteger.ZERO;
            }
            else
            {
                if(QQ[i][0]==1)
            {
                for (int j = QQ[i][1]-1; j <QQ[i][2]; j=j+2) {
                    s1=s1.add(A.get(j));
                    //System.out.println(s1);
                }
                for (int j = QQ[i][1]; j <QQ[i][2]; j=j+2) {
                    s2=s2.add(B.get(j));
                    //System.out.println(s2);
                }
            }
            if(QQ[i][0]==2)
            {
                for (int j = QQ[i][1]-1; j <QQ[i][2]; j=j+2) {
                    s1=s1.add(B.get(j));
                    
                }
                for (int j = QQ[i][1]; j <QQ[i][2]; j=j+2) {
                    s2=s2.add(A.get(j));
                    
                }
            }
             System.out.println(s1.add(s2));
             s1=BigInteger.ZERO;
             s2=BigInteger.ZERO;
            }
        }
         
    }
    public static ArrayList<BigInteger> merge(ArrayList<BigInteger> a, ArrayList<BigInteger> b) {
    int c1 = 0, c2 = 0;
    ArrayList<BigInteger> res = new ArrayList<>();

    while(c1 < a.size() || c2 < b.size()) {
        if(c1 < a.size())
            res.add((BigInteger) a.get(c1++));
        if(c2 < b.size())
            res.add((BigInteger) b.get(c2++));
    }
    return res;
}
}
