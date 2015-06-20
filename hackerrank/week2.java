package hackerrank;


public class week2{
     public static boolean isAnnagram(String w,String a)
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
   public static void main(String args[]){
      String Str = new String("abba");
String []sub=new String[10];
int k=0,count=0;
      //char[] chars=Str.toCharArray();
     
     for(int i=0;i<4;i++)
     {
         for(int j=i;j<4;j++)
         {
            char s=Str.charAt(i);
            char t=Str.charAt(j);
            
            sub[k++]=new StringBuilder().append(s).append(t).toString();
            
             
         }
     }
     
    week2 l=new week2();
    for(int i=0;i<10;i++)
    {
        for(int j=i+1;j<10;j++)
            if(l.isAnnagram(sub[i], sub[j]))
            {
                count++;
            }
    }
       System.out.println(count);
   }
}