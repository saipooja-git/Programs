package java_new_programs;

import java.util.Scanner;

public class PrimeNumbersInGivenRange {

	public static void main(String[] args) {

		int n1,n2,i,j;
		System.out.print("Enter two numbers");
		Scanner s = new Scanner(System.in);
		n1=s.nextInt();
		n2=s.nextInt();
		for(i=n1;i<=n2;i++)
		{
			for(j=2;j<=i;j++)
			{
				if(i%j==0)
				break;
			}
			if(i==j)
			{
				System.out.print(j+" ");
			}
		}
				
	}

}
