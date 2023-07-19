package java_new_programs;
import java.util.Scanner;
public class Add {
	public static void add(int a ,int b) {
		int sum = a+b;
		System.out.println("sum: "+ sum);
		
	
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value a : ");
		int a=s.nextInt();
		System.out.println("Enter the value b : ");
		int b=s.nextInt();
		add(a,b);
        s.close();


		
	}

}
