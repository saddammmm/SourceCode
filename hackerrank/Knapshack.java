package hackerrank;

import java.util.Scanner;

class Knapshack {
  
 public static void main(String[] args) {
     int n,m,t;
     
  Scanner sc=new Scanner(System.in);
  t=sc.nextInt();
     for (int i = 0; i < t; i++) {
          n=sc.nextInt();
          m=sc.nextInt();
          int []W=new int[n];
          int []V=new int[n];
          for (int j = 0; j <n; j++) {
             W[i]=sc.nextInt();
         }
          for (int j = 0; j < n; j++) {
             V[i]=W[i];
         }
  
  
  System.out.println(Knapsack(W, V, m));
     }
 
 }
  
 public static int Knapsack(int [] W, int [] V, int M) {
  
  int wLen = W.length;
  int [] K = new int[M+1];
  K[0] = 0;
  int best = 0;
  for (int w=1; w <= M; w++) {
    
   for (int i=0; i <wLen; i++) {
    if (w >= W[i]) {
     best = Math.max(K[w-W[i]] , best);
    }
   }
   K[w] = best;
  }
   
 
   
  return K[M];
 }
}
    