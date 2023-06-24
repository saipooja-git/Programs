package java_new_programs;

import java.util.Scanner;

public class ToCheckWhetherANumberPrimeOrNot {

	public static void main(String[] args) {

		int n,count=0;
		System.out.print("Enter a number:");
		Scanner s = new Scanner(System.in);
		n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count == 2)
		{
			System.out.print(n+" "+"is a Prime Number.");
		}
		else
		{
			System.out.print(n+" "+"not  a prime number.");
		}
	}

}
