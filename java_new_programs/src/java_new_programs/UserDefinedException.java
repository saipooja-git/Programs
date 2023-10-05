package java_new_programs;
class InvalidAgeException extends Exception{ 
// since these are userdefined exceptions so w create a seperate class of that particular exception
	InvalidAgeException(String msg){
		System.out.println(msg);
	}
}
public class UserDefinedException {
	public static void Vote(int age) throws InvalidAgeException{
	
		if (age<18) {
			throw new InvalidAgeException("Not eligible to vote...!");
		}
		else {
			System.out.println("Eligible to vote...!");
		}
	}


	public static void main(String[] args) {

		try {
			Vote(12);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

	}
