package java_new_programs;
import java.util.Scanner;
public class LeftTriangleStarPattern {

	public static void main(String[] args) {

		int i,j,n;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number of rows");
		n = s.nextInt();
		
	for(i=0;i<n;i++)
	{
		for(j=2*(n-i);j>=0;j--)
		{
			System.out.print(" ");
			
		}
		for(j=0;j<=i;j++)
		{
			System.out.print("* ");
			
		}
		System.out.println();
		
	}
	}

}
