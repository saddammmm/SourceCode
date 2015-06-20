package hackerrank;

import java.util.ArrayList;
import java.util.Scanner;
 
class sub
{
    public static boolean isAnnagram(String w,String a)throws NullPointerException
    {
        if(w.length()!=a.length())
        {
            return false;
        }
     
        char[] chars=w.toCharArray();
        for(char c: chars)
        {
            int index=a.indexOf(c);
            if(index!=-1)
                a=a.substring(0, index)+a.substring(index+1, a.length());
            else {
    return false;
}
        }
            return a.isEmpty();
    }
   public static void main(String args[])throws NullPointerException
   {
        sub l=new sub();
       //String string;
      int i, c, length,test;
       //int  k=0;
      Scanner in = new Scanner(System.in);
     test=in.nextInt();
     in.nextLine();
     while(test!=0)
     { 
         String string  = in.nextLine();
 
      length = string.length();  
      //String[] subt=new String[length];
         ArrayList<String> subt=new ArrayList<>();
 int count=0;
      
 
      for( c = 0 ; c < length ; c++ )
      {
         for( i = 1 ; i <= length - c ; i++ )
         {
            subt.add(string.substring(c, c+i)); 
            
         }
      }
      int k=subt.size();
       //String t1,t2;
       
      for(i=0;i<k;i++)
    {
    
        for(int j=i+1;j<k;j++)
           
         
            if(l.isAnnagram(subt.get(i), subt.get(j)))
            {
                count++;
            }
          
    }
      System.out.println(count);
       test--;
       k=0;
     }
      
     
   }
}