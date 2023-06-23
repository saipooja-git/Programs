package java_new_programs;

import java.util.Scanner;

public class LengthOfAnArray {

	public static void main(String[] args) {

		int a[] = new int[5];
		System.out.print("Enter the elements");
		Scanner s = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			a[i] = s.nextInt();
		}
		System.out.print("Array elements");
		for(int i =0;i<5;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.print("Array length:"+ a.length);
	}

}
