package java_new_programs;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {

		int firstInteger,secondInteger;
	
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the First Integer:");
        firstInteger=s.nextInt();
		System.out.println("Enter the Second Integer:");
		secondInteger=s.nextInt();		
		float addition = add(firstInteger,secondInteger);
		int intValue = (int) addition;
		System.out.println("Addition :"+intValue);
		float subtraction = sub(firstInteger,secondInteger);
		int intValu = (int) subtraction;
		System.out.println("Subtraction :"+intValu);
		float multipli = mul(firstInteger,secondInteger);
		int intVal = (int) multipli;
		System.out.println("Multiplication :"+intVal);
		float division = div(firstInteger,secondInteger);
		System.out.println("Division :"+division);
		s.close();
	}
		public static float add(float firstInteger,float secondInteger) {
			return firstInteger+secondInteger;
		}
		
		public static float sub(float firstInteger,float secondInteger) {
			return firstInteger-secondInteger;
		}
		public static float mul(float firstInteger,float secondInteger) {
			return firstInteger*secondInteger;
		}
		public static float div(float firstInteger,float secondInteger) {
			if(secondInteger!=0) {
			return firstInteger/secondInteger;
		}
			else
				return 0;
		
		
	}

}
/***
 Enter the First Integer:
5
Enter the Second Integer:
2
Addition :7
Subtraction :3
Multiplication :10
Division :2.5

 */
/***
 package java_new_programs;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {

		int firstInteger,secondInteger;
	
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the First Integer:");
        firstInteger=s.nextInt();
		System.out.println("Enter the Second Integer:");
		secondInteger=s.nextInt();		
		System.out.println("Enter the operator(+,-,*,/)");
		char operator = s.next().charAt(0);
		
		switch (operator) {
		case '+':
			add(firstInteger,secondInteger);
			break;
			
		case '-':
			sub(firstInteger,secondInteger);
			break;
		case'*':
			mul(firstInteger,secondInteger);
			break;
		case'/':
			div(firstInteger,secondInteger);
			break;
			default:
				System.out.println("Invalid Operator");
		}
		s.close();
	}
		public static void add(int a,int b) {
			System.out.println("Addition :"+(a+b));
		}
		
		public static void sub(int a,int b) {
			System.out.println("Subtraction :"+ (a-b));
		}
		public static void mul(int a,int b) {
			System.out.println("Multiplication :"+(a*b));
		}
		public static void div(int a,int b) {
			if(b!=0) {
			System.out.println("Division :"+(a/b));
		}
			else
				System.out.println("Divison is not allowed");
		
		
	}

}
**/
