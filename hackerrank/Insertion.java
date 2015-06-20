package hackerrank;

import java.util.Scanner;

public class Insertion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
                int i;
                i=sc.nextInt();
		int[] input = new int[i];
                for(int j=0;j<i;j++)
                {
                    input[j]=sc.nextInt();
                }
		insertionSort(input);
	}
	
	private static void printNumbers(int[] input) {
		
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] );
                        
		}
		System.out.println("\n");
	}

	public static void insertionSort(int array[]) {
		int n = array.length;
		for (int j = 1; j < n; j++) {
			int key = array[j];
			int i = j-1;
			while ( (i > -1) && ( array [i] > key ) ) {
				array [i+1] = array [i];
				i--;
			}
			array[i+1] = key;
			printNumbers(array);
		}
	}
}