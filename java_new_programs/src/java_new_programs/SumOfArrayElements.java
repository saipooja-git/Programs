package java_new_programs;

import java.util.Scanner;

public class SumOfArrayElements {

	public static void main(String[] args) {

		int sum=0;
		int a[] = new int[5];
		System.out.print(" Enter array elements:");
		Scanner s = new Scanner(System.in);
		for(int i=0;i<5;i++)  // can also be written as for(int i=0;i<a.length;i++);
		{
			a[i]=s.nextInt();
			
		}
		for(int i=0;i<5;i++) // can also be written as for(int i=0;i<a.length;i++);
		{
			System.out.print(a[i]+" ");
			sum=a[i]+sum;
		}
		System.out.println();
		System.out.print("Addition of array elements:"+ sum);
		
		
	}

}
