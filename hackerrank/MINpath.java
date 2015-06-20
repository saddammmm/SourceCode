/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author Saddam
 */
public class MINpath {
    public static boolean thereisPath(int curx,int cury,int[][]arr)
    {
        Queue<Integer>q=new LinkedList<>();
        List<String>ll=new ArrayList<String>();
        q.add(cury);
        q.add(curx);
        int dx[]={1,-1,0,0};
        int dy[]={0,0,1,-1};
        ll.add(curx+""+cury);
        while(!q.isEmpty())
        {
            int x=q.poll();
            int y=q.poll();
            for (int i = 0; i < 4; i++) {
                int xx=x+dx[i];
                int yy=y+dy[i];
                if(xx>0&&yy>0&&xx<5&&yy<5)
                {
                    if(ll.indexOf(xx+""+yy)<0&&(arr[xx][yy]==0||arr[xx][yy]==2))
                    {
                        if(arr[xx][yy]==2)
                        return true;
                        q.add(xx);
                        q.add(yy);
                        ll.add(xx+""+yy);
                    }
                }
                }  
                
            
        
    }return false;
    }
    public static void main(String args[])
            
    {  int test; int m,n;
        
        Scanner sc=new Scanner(System.in);
        test=sc.nextInt();
        for (int u = 1; u <=test; u++) {
            
        
        m=sc.nextInt();
        n=sc.nextInt();
        sc.nextLine();
        String[] k= new String[m];
        for (int i = 0; i < m; i++) {
            k[i]=sc.nextLine();
            
        }
        
             int sCoordX = 0;
            int sCoordY = 0;
            int eCoordX = 0;
            int eCoordY = 0;
        char[][] ch=new char[m][n];
        for (int i = 0; i <m; i++) {
            for (int j = 0; j < n; j++) {
                ch[i][j]=k[i].charAt(j);
                if(ch[i][j]=='S')
                {
                    sCoordY = j;
             eCoordX = i;
                }
                
                 if(ch[i][j]=='G')
                {
                    eCoordY = j;
             eCoordX = i;
                }
            }
            
        }
        
        boolean reached = false;
            int counter = 0;
            int posX = sCoordX;
            int posY = sCoordY;
            while(!reached)
            {
                if(ch[posX][posY] == 'G')
                {
                    reached = true;
                    
                    System.out.println("Case"+" "+"#"+u+":"+counter);
                    
                }
                
                

                if(!reached && posX > eCoordX)
                {
                        posX--;
                        counter++;                  
                }
                else if(!reached && posX < eCoordX)
                {
                    posX++;
                    counter++;                  
                }

                if(!reached && posY > eCoordY)
                {
                    posY--;
                    counter++;          
                }
                else if(!reached && posY < eCoordY)
                {
                    posY++;
                    counter++;              
                }
            }
        
        }
        
    }
    
}
