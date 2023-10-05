package java_new_programs;

public class Ipad {
 
	double lengthOfIpad;
	double widthOfIpad;
	double heightOfIpad;
	
	public Ipad() {
		lengthOfIpad = 5;
		widthOfIpad = 4;
		heightOfIpad = 5;
	}
	public Ipad(double lengthOfIpad, double widthOfIpad, double heightOfIpad) {
		this.lengthOfIpad=lengthOfIpad;
		this.widthOfIpad=widthOfIpad;
		this.heightOfIpad=heightOfIpad;
	}
	public double getLengthOfIpad() {
		return lengthOfIpad;
	}
	public void setLengthOfIpad(double lengthOfIpad) {
		this.lengthOfIpad = lengthOfIpad;
	}
	public double getWidthOfIpad() {
		return widthOfIpad;
	}
	public void setWidthOfIpad(double widthOfIpad) {
		this.widthOfIpad = widthOfIpad;
	}
	public double getHeightOfIpad() {
		return heightOfIpad;
	}
	public void setHeightOfIpad(double heightOfIpad) {
		this.heightOfIpad = heightOfIpad;
	}
	
	public double perimeterOfIpad() {
     return  4*(lengthOfIpad+widthOfIpad+heightOfIpad);
	}
	public double  volumeOfIpad() {
		return lengthOfIpad*widthOfIpad*heightOfIpad;
	}
	public String toString() {
		return "Length of Ipad is - " + lengthOfIpad + "\n" +
	               "Width of Ipad is - " + widthOfIpad + "\n" +
	               "Height of Ipad is - " + heightOfIpad;		}
	
	}