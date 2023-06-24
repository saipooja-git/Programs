package java_new_programs;
import java.util.Scanner;
public class SearchArrayElements {

	public static void main(String[] args) {

		int a[] = new int[5];
		int n,count=0;
		System.out.print("Enter the elements");
		Scanner s = new Scanner(System.in);
		for (int i=0;i<5;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.print("Array Elements");
		for(int i=0;i<5;i++)
		{
		
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.print("Enter search element");
		n = s.nextInt();
		for (int i=0;i<5;i++ )
		{
			if(a[i]==n)
			{
				count++;
			}
		}
		if(count>0)
		{
			System.out.print(count + "times, Item found");
		}
		else
		{
			System.out.print("Item not found");
		}
		}
	

}
