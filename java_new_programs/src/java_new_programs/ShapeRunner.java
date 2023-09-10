package java_new_programs;

public class ShapeRunner {

	public static void main(String[] args) {

		Circle circle = new Circle("circle", 5);
		System.out.println(circle.name);
		System.out.println(circle.calculateArea());
	}

}
