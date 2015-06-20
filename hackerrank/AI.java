package hackerrank;

import java.util.Scanner;

/**
 *
 * @author Saddam
 */
 class AI {
    
    
    public static void main(String args[])
    {
        int n,x,y,left,up;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        x=sc.nextInt();
        y=sc.nextInt();
        sc.nextLine();
        String[]G=new String[n];
        short[]boat=new short[2];
        short[]princes=new short[2];
        for (int i = 0; i < n; i++) {
            G[i]=sc.nextLine();
            
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(G[i].charAt(j)=='p'){
                    princes[0]=(short) i;
                princes[1]=(short) j;}
            } }
            boat[0]=(short) x;
            boat[1]=(short) y;
            left=princes[1]-boat[1];
            if ((up = princes[0] - boat[0]) < 0) {
    if(up<0){
        for(; up < 0; ++up)
            System.out.println("UP");}
   else {
    for(; up > 0; --up)
        System.out.println("DOWN");}
            }

else
  {
    if(princes[1]-boat[1]<0){
       
           System.out.println("LEFT");
    boat[1]++;}
   else {
   for(; left >0; --left)
       System.out.println("RIGHT");}
  }
                
        
       
    }
    
}
