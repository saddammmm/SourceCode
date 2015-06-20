package hackerrank;

import java.util.Scanner;

public class Quick {

    /**
     * @param args
     */
    public static void main(String[] args) {

        int s;
        Scanner sc=new Scanner(System.in);
        s=sc.nextInt();
        int[]a=new int[s];
        for(int i=0;i<s;i++)
        {
        a[i]=sc.nextInt();
        }
        Quick q=new Quick();
        q.partition(a, 0, s-1);
        for(int i=0;i<s;i++)
        {
        System.out.print(a[i]+" ");
        }
    }

   

    public static int partition(int[] a, int p, int r) {

        int x = a[p];
        int i = p-1 ;
        int j = r+1 ;

        while (true) {
            i++;
            while ( i< r && a[i] < x)
                i++;
            j--;
            while (j>p && a[j] > x)
                j--;

            if (i < j)
                swap(a, i, j);
            else
                return j;
        }
    }

    private static void swap(int[] a, int i, int j) {
        // TODO Auto-generated method stub
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}