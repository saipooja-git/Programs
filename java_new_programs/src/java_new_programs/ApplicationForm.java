package java_new_programs;
import java.util.Scanner;
public class ApplicationForm {

	public static void main(String[] args) {

		String name;
		String instituite;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your name:");
		name=s.nextLine();
		System.out.println("Enter your instituite:");
		instituite = s.nextLine();
		System.out.println("Name:"+name.toUpperCase());
		System.out.println("Instituite:"+instituite.toLowerCase());
		System.out.println("Index of first occurence of letter v:"+name.indexOf('v'));
		System.out.println("Character at index 5 of instituite:"+ instituite.charAt(5));


	s.close();
		
	
	}

}
/***
Enter your name:
avesh kumar
Enter your instituite:
northwest missouri state university
Name:AVESH KUMAR
Instituite:northwest missouri state university
Index of first occurence of letter v:1
Character at index 5 of instituite:w
*/