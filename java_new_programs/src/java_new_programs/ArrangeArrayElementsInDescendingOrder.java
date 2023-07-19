package java_new_programs;
import java.util.Scanner;

public class ArrangeArrayElementsInDescendingOrder {
	public static void main(String[] args) {
		int a[]= new int [5];
		int temp;
		System.out.print("Enter array elements: ");
		Scanner s = new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.print("array elements are: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.print("array elements in descending order :");
		for(int i=0;i<5;i++)
		{
			for(int j=i+1;j<5;j++)
			{
				if(a[i]<a[j])
				{
					temp = a[i];
					a[i]  = a[j];
					a[j]= temp;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print( a[i]+ " " );
		}
        s.close();

	}
}