package java_new_programs;

import java.util.Scanner;

public class SquareRootOfAnyNumber {

	public static void main(String[] args) {

		int n;
		System.out.print("Enter a number:");
		Scanner s = new Scanner(System.in);
		n=s.nextInt();
		double m = Math.sqrt(n);
		System.out.print(n+" "+"square root is"+" "+m);
	}

}
