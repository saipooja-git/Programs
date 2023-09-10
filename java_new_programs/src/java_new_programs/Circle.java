package java_new_programs;

public class Circle extends Shape {
	double radius;
	Circle(String name,double radius){
		super(name);
		this.radius=radius;
	}
	@Override
	double calculateArea() {
		return Math.PI*radius*radius;
	}
	

}
