package java_new_programs;
import java.util.Scanner;

public class PrintArrayElementsInReverseOrder {

	public static void main(String[] args) {
		int a[] = new int[5];
		Scanner s= new Scanner(System.in);
		System.out.print("Enter elements in array");
		for(int i=0;i<5;i++)
		{
			a[i]=s.nextInt();
			
		}
		for(int i=0;i<5;i++)
		{
			System.out.print("array elements"+ a[i]);
		}
		
		System.out.print("Reverse order elements");
		for(int i=4;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
		
	}

}
