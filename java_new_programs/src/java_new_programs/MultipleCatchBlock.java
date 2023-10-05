package java_new_programs;

	
		public class MultipleCatchBlock {

		    public static void main(String[] args) {

		 
		
		// case3 when st3 has exception and that exception e havnot mentioned in catch block(nullpointerexception)
		try {
			//st1
			int a=10,b=2,c;
			c=a/b;
			System.out.println(c);
			//st2
		   int 	arr[]= {10,20,30};
			System.out.println(arr[1]);
			//st3
			String s = null;
			System.out.println(s.toUpperCase());
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("array beyond limit");
		}
		catch(ArithmeticException e) {
			System.out.println("can't divide by 0");
		}
		catch(NumberFormatException e) {
			System.out.println("wrong number format");
		}
		catch(Exception e) {
			System.out.println("All types of exceptions accepted");
		}
		}
	}
/* 5
20
All types of exceptions accepted -------> since exception e acts as a super class to subclass nullpointer exception and prints this as we havenot mentiones nullpointer exception in catch blocks*/
	
	
	/**	// case2 when st2 has exception
		try {
			//st1
			int a=10,b=2,c;
			c=a/b;
			System.out.println(c);
			//st2
		   int 	arr[]= {10,20,30};
			System.out.println(arr[4]);
			//st3
			String s = "Pooja";
			System.out.println(s);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("array beyond limit");
		}
		catch(ArithmeticException e) {
			System.out.println("can't divide by 0");
		}
		catch(NumberFormatException e) {
			System.out.println("wrong number format");
		}
		catch(Exception e) {
			System.out.println("All types of exceptions accepted");
		}
		}
	}
**/
	
/** // case1
	try {
		//st1
		int a=10,b=2,c;
		c=a/b;
		System.out.println(c);
		//st2
	   int 	arr[]= {10,20,30};
		System.out.println(arr[1]);
		//st3
		String s = "Pooja";
		System.out.println(s);
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("array beyond limit");
	}
	catch(ArithmeticException e) {
		System.out.println("can't divide by 0");
	}
	catch(NumberFormatException e) {
		System.out.println("wrong number format");
	}
	catch(Exception e) {
		System.out.println("All types of exceptions accepted");
	}
	}
}
**/