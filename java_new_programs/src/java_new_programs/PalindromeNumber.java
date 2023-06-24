package java_new_programs;
import java.util.Scanner;
public class PalindromeNumber {

	public static void main(String[] args) {

		int c,s=0,r,n;
		System.out.print("Enter any number:");
		Scanner  a = new Scanner(System.in);
		n=a.nextInt();
		c=n;
		while(n>0)
			{
			r=n%10;
			s=(s*10)+r;
			n=n/10;
			}
		if(c==s)
		{
			System.out.print(c+" " +"is a Palindrome number");
		}
		else
		{
			System.out.print(c +" "+"is not a palindrome number");
		}
			}

}

//Enter any number:121
// 121 is a Palindrome number.
//Enter any number:123
//123 is not a palindrome number
