/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author shussain
 */
public class Prmatama {
  

    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
        int t;
        ArrayList<Character>A=new ArrayList<>();
        t=sc.nextInt();
        sc.nextLine();
        while(t>0){
        String x = sc.nextLine();
        String y =  sc.nextLine();
        int M = x.length();
        int N = y.length();

        // opt[i][j] = length of LCS of x[i..M] and y[j..N]
        int[][] opt = new int[M+1][N+1];

        // compute length of LCS and all subproblems via dynamic programming
        for (int i = M-1; i >= 0; i--) {
            for (int j = N-1; j >= 0; j--) {
                if (x.charAt(i) == y.charAt(j))
                    
                    opt[i][j] = opt[i+1][j+1] + 1;
                else 
                    opt[i][j] = Math.max(opt[i+1][j], opt[i][j+1]);
            }
        }
        if(opt[0][0]>0)
                System.out.println("Yes");
        else
                System.out.println("No");
            /*
        // recover LCS itself and print it to standard output
        int i = 0, j = 0;
        while(i < M && j < N) {
            if (x.charAt(i) == y.charAt(j)) {A.add(x.charAt(i));
                //System.out.print(x.charAt(i)+" "+"mannn");
                
                i++;
                j++;
            }
            else if (opt[i+1][j] >= opt[i][j+1]) i++;
            else                                 j++;
        }
       
      if(A.isEmpty())
            System.out.println("No");
      else
            System.out.println("yes");*/
      
        t--;
        A.clear();
         }
        

    }

}
