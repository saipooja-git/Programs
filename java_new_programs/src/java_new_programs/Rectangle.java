package java_new_programs;

public class Rectangle {
	//constructor
	public Rectangle(int length, int breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	// state
	private int length;
	private int breadth;
	// for getters and setters >right click >source> select generate getters and setters
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	
	// operations
	public int area() {
		return length*breadth;
	}
	
	public int perimeter(){
		return 2 *(length + breadth);
	}
	
	public String toString() {
	//	return String.format("length - %d,breadth - %d ,area - %d,perimeter - %d",length,breadth,area,perimeter); //here area and perimeter cannot be resolved to a variable so write them as methods
		return String.format("length - %d,breadth - %d ,area - %d,perimeter - %d",length,breadth,area(),perimeter());
	}
	

}
