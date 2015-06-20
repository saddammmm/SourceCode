package hackerrank;

import java.util.ArrayList;

public class MyQuickSort {

    /**
     * @param args
     */
    public static void main(String[] args) {

        //int[] a = { 1, 23, 45, 2, 8, 134, 9, 4, 2000 };
        int a[]={23,44,1,2009,2,4,123,7,999,1040,88};
         Quick q=new Quick();
      q.partition(a, 0, 10);
      
        for(int i=0;i<10;i++)
        {
            System.out.print(a[i]+" ");
        }
        
    }

   

   public int partition (int arr[], int l, int h)
{
    int x = arr[h];    // pivot
    int i = (l - 1);  // Index of smaller element
 
    for (int j = l; j <= h- 1; j++)
    {
        // If current element is smaller than or equal to pivot 
        if (arr[j] <= x)
        {
            i++;    // increment index of smaller element
            swap(arr,i,j);  // Swap current element with index
        }
    }
   // swap(&, &arr[h]);  
    return (i + 1);
}
 
/* arr[] --> Array to be sorted, l  --> Starting index, h  --> Ending index */
void quickSort(int arr[], int l, int h)
{
    if (l < h)
    {
        int p = partition(arr, l, h); /* Partitioning index */
        quickSort(arr, l, p - 1);
        quickSort(arr, p + 1, h);
    }
}
    private static void swap(int[] a, int i, int j) {
        // TODO Auto-generated method stub
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}