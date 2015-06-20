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
public class PrincesAndBoat {
    
    
    public static void main(String args[])
    {
        int n,x,y,left,up,xi=0,yi=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        x=sc.nextInt();
        y=sc.nextInt();
        sc.nextLine();
        String[]G=new String[n];
        
        for (int i = 0; i < n; i++) {
            G[i]=sc.nextLine();
            
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(G[i].charAt(j)=='p'){
                    xi= i;
               yi=j;}
            } }
          up=xi-x;
          left=yi-y;
           
       while(!(xi-x==0&&yi-y==0)) {   
      if(up<0)
      {
          System.out.println("UP");
          x--;
          break;
      }
      if(up>0){
          System.out.println("DOWN");
          x++;
          break;
      }
      if(left<0){
          System.out.println("LEFT");
          y--;
          break;
      }
        if (left>0) {
            System.out.println("RIGHT");
            y++;
            break;
        }
                
        
       }
    }
    
}
