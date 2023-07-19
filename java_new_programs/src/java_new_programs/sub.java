package java_new_programs;
import java.util.Scanner;
public class sub {

	public static void subtraction(int a ,int b) {
		int sub = a-b;
		System.out.println("sub: "+ sub);
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value a : ");
		int a=s.nextInt();
		System.out.println("Enter the value b : ");
		int b=s.nextInt();
		subtraction(a,b);
        s.close();


		
	}

}
