package java_new_programs;
import java.util.Scanner;
public class Patient {

	public static void main(String[] args) {

		String firstName;
		String lastName;
		String appointmentReason;
		Scanner s = new Scanner(System.in);
		System.out.println("What is your First Name?");
		System.out.println("What is your Last Name?");
		System.out.println("Your Reason for Appointment?");
		firstName= s.nextLine();
		lastName = s.nextLine();
		appointmentReason = s.nextLine();
		
		System.out.println("***********************************************");
		System.out.println("**************Patient Details******************");
		System.out.println("Name-->"+ firstName+" " + lastName);
		System.out.println("Reason for appointment-->"+appointmentReason);

		s.close();


		
	}

}
