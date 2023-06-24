package java_new_programs;
import java.util.Scanner;
public class ArmstrongNumber {

	public static void main(String[] args) {

		int rem ,arm=0,n,c;
		System.out.print("Enter a number:");
		Scanner s =new Scanner(System.in);
		n=s.nextInt();
		c=n;
		while(n>0)
		{
			rem=n%10;
			arm=(rem*rem*rem)+arm;
			n=n/10;
		}
		if(c == arm)
		{
			System.out.print(c+" "+"Armstrong number");
		}
		else
		{
			System.out.print(c+" "+"not an armstrong number");
		}
	}

}
