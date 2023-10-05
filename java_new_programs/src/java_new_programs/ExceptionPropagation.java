package java_new_programs;

public class ExceptionPropagation {

	public static void main(String[] args) {

		try {
		m1();
		}
		catch(Exception e) {
			System.out.println("Handled by main()");
		}
		
	}
	public static void m1() {
	m2();
	}
	public static void m2() {
		System.out.println(10/0);
	}

}
/**
public static void main(String[] args) {

m1();

}
public static void m1() {
try {
m2();
}
catch(Exception e) {
	System.out.println("Handled by m1()");
}
}
public static void m2() {
System.out.println(10/0);
}
*/