package java_new_programs;

public abstract class Shape {
	String name;
	Shape(String name){
		this.name=name;
		
	}
 
	abstract double calculateArea();
}
