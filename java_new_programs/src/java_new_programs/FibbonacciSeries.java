package java_new_programs;
import java.util.Scanner;
public class FibbonacciSeries {

	public static void main(String[] args) {

		int term,a=0,b=1,c;
		System.out.print("Enter term: ");
		Scanner s = new Scanner(System.in);
		term=s.nextInt();
		for(int i=1;i<=term;i++)
		{
		System.out.print(a+" ");
		c=a+b;
		a=b;
		b=c;
		}
		
		
	}

}
