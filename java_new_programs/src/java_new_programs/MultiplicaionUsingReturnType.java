package java_new_programs;
import java.util.Scanner;
public class MultiplicaionUsingReturnType {
	public static int multiplicationType(int a , int b) {
		int c = a*b;
		return c;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1st value: ");
		int a=s.nextInt();
    	System.out.println("Enter 2nd value: ");
    	int b = s.nextInt();
    	int c = multiplicationType(a,b);
    	System.out.printf("the value of c is: " + c).println();
        s.close();


		
	}

}
