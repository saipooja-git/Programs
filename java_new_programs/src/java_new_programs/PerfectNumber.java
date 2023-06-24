package java_new_programs;
import java.util.Scanner;
public class PerfectNumber {

	public static void main(String[] args) {


		int n,sum=0;
		System.out.print("Enter any number:");
		Scanner s = new Scanner(System.in);
		n=s.nextInt();
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		if(n==sum) {

			System.out.print(n+" "+ "is a perfect number.");
		}
		else
		{
			System.out.print(n+" "+"is not a perfect number");
		}
	}

}

/* Enter any number:10
10 is not a perfect number

Enter any number:6
6 is a perfect number.

*/