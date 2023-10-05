package java_new_programs;

public class NestedCatchBlock {

	public static void main(String[] args) {
		try {
			System.out.println(10/0);
			
		}
		catch(Exception e) {
			System.out.println(e);// here already above we have an exception which is diff from below one, 
			//so this step will help you to know whats the exception above and y is it so.
			try {
			String s= null;
			System.out.println(s.toUpperCase());
			}
			catch(Exception n) {// though you dont mention specific exception it do prints 
				//as it acts like super exception class to a subclass of nullpointer exception
				System.out.println("null values can't be converted");

		}
	}
	}
}
/**
 * 		// y we should use nested catch block
		try {
			System.out.println(10/0);
			
		}
		catch(Exception e) {
			
			String s= null;
			System.out.println(s.toUpperCase());
			
				
			}

 Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.toUpperCase()" because "s" is null
	at java_new_programs/java_new_programs.NestedCatchBlock.main(NestedCatchBlock.java:14)
	
	explaination: since there is an exception in try block
	 so it goes for catch block to execute but what if there is an exception so to handle it we  use nested catch block
 */

/**

//case1) to handle exception in ctch block
try {
	System.out.println(10/0);
	
}
catch(Exception e) {
	System.out.println(e);// here already above we have an exception which is diff from below one, 
	//so this step will help you to know whats the exception above and y is it so.
	try {
	String s= null;
	System.out.println(s.toUpperCase());
	}
	catch(NullPointerException n) {
		System.out.println("null values can't be converted");
		
	}
}
**/