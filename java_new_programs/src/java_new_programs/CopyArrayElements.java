package java_new_programs;
import java.util.Scanner;
public class CopyArrayElements {

	public static void main(String[] args) {

		int a[] = new int[5];
		int b[] = new int[5];
		
		System.out.print("Enter array elements");
		Scanner s = new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			a[i] = s.nextInt();
		}
		System.out.print("First array elements"+ " ");
		for(int i=0;i<5;i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.print("Second array elements"+ " ");
		for(int i=0;i<5;i++)
		{
			b[i] = a[i];
			System.out.print(b[i]+" ");
		}
				
	}

}
