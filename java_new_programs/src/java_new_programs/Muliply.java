package java_new_programs;

import java.util.Scanner;

public class Muliply {
	public static void multiply(int a ,int b) {
		int mul = a*b;
		System.out.println("multiplication: "+ mul);
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value a : ");
		int a=s.nextInt();
		System.out.println("Enter the value b : ");
		int b=s.nextInt();
		multiply(a,b);
        s.close(); // when entering this statement only the yellow triangle is not showing

	}

}
