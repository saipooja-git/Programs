package java_new_programs;

public class NestedTryBlock {

	public static void main(String[] args) {
//case4:  exception at top in outer try block and also exception in  inner try block
		try {
			System.out.println(10/0);

			try {
				int a[]= {1,2,3};
				System.out.println(a[5]);
		}
			catch(ArrayIndexOutOfBoundsException a) {
				System.out.println(a);
			}

	}

		catch(ArithmeticException e) {
			System.out.println(e);
		}
System.out.println("Happy coding");
}
}
/**
------------>//case1: no exception
		try {
			System.out.println(10/2);

			try {
				int a[]= {1,2,3};
				System.out.println(a[2]);
		}
			catch(ArrayIndexOutOfBoundsException a) {
				System.out.println(a);
			}
	}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("Happy coding");

 
----------->//case2:  exception at bottom in outer try block and after inner try blocks and inner catch block 
		try {

			try {
				int a[]= {1,2,3};
				System.out.println(a[2]);
		}
			catch(ArrayIndexOutOfBoundsException a) {
				System.out.println(a);
			}
			System.out.println(10/0);

	}

		catch(ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("Happy coding");
		
		
	----->	//case3:  exception at bottom in outer try block and also exception in  inner try block
		try {

			try {
				int a[]= {1,2,3};
				System.out.println(a[5]);
		}
			catch(ArrayIndexOutOfBoundsException a) {
				System.out.println(a);
			}
			System.out.println(10/0);

	}

		catch(ArithmeticException e) {
			System.out.println(e);
		}
System.out.println("Happy coding");

**/