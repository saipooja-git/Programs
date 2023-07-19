package java_new_programs;

import java.util.Scanner;

public class AverageOfArrayElements {

	public static void main(String[] args) {

		int a[] = new int[5];
		int avg=0;
		float c,f,sum=0;
		System.out.print("Enter array elements: ");
		Scanner s = new Scanner(System.in);
		for (int i=0;i<5;i++)
		{
			a[i]=s.nextInt();
		
		}
		System.out.print("Array Elements are:" );
		for(int i=0;i<5;i++)
		{
			System.out.print(a[i]+" ");
		}
		for(int i=0;i<a.length;i++)
		{
			sum = sum+a[i];
		}
		c = (float) sum; // converted sum which is int to float
		System.out.println();
		System.out.print("Sum of array elements:"+c); 
		System.out.println();
		f = (float) avg;  // converted integer value avg into float value f
		// float float value = (float) integer value (syntax)
		// or
		//float float_value = Float.parseFloat(Integer.toString(integer_value));  //(syntax)
		f=c/5;


		System.out.print("avg of array elements is:"+f); // to get output in float values did this
        s.close();

	}

}

/*
 Enter array elements: 1
2
3
4
4
Array Elements are:1 2 3 4 4 
Sum of array elements:14.0
avg of array elements is:2.8
*/
