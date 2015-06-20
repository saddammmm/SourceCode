/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.Scanner;

/**
 *
 * @author Saddam
 * 
 */

public class subArray {
    public int maxSequenceSum(int[] arr)
    {
        int maxSoFar=arr[0],maxEndingHere=arr[0];
        for (int i = 1; i < arr.length; i++)
        {
           
            if (maxEndingHere < 0)
                maxEndingHere = arr[i];
            else
                maxEndingHere += arr[i];
 
            
            if (maxEndingHere >= maxSoFar)
                maxSoFar = maxEndingHere;
        }
        return maxSoFar;
    }
public int maxNonContSum(int[] arr)
{
    int maxSoFar=arr[0],maxEndingHere=arr[0];
        for (int i = 1; i < arr.length; i++)
        {
            if(maxEndingHere<0){
                if(arr[i]>0)
                    maxEndingHere=arr[i];
                else
                   maxEndingHere=maxEndingHere;
            }
            else
            {
                if(arr[i]>0)
                    maxEndingHere+=arr[i];
            else
                           maxEndingHere=maxEndingHere;
            }
            if (maxEndingHere >= maxSoFar)
                maxSoFar = maxEndingHere;
            
        }
        return maxSoFar;
}
     

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int test,s;
        test=sc.nextInt();
        while(test!=0)
        {
        s=sc.nextInt();
        int[] ar=new int[s];
        for(int i=0;i<s;i++)
        {
            ar[i]=sc.nextInt();
        }
        subArray m=new subArray();
        int sum1=m.maxSequenceSum(ar);
       
        int sum2=m.maxNonContSum(ar);
        System.out.println(sum1+" "+sum2);
    }
        test--;
    }
}
