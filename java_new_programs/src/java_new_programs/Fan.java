package java_new_programs;

public class Fan {
	// state or behaviours 
	private String make;
	private double radius;
	private String color;
	
	private boolean isOn;
	private byte speed;
	
	
	// constructor or creation
	// once done with creating so we cannot change so these below make,radius,color are witten in one constructor
	public Fan(String make,double radius, String color) {
		this.make=make;
		this.radius=radius;
		this.color=color;
	}
	
	//behavioral methods
	
	public void switchOn() {
		this.isOn =true;
		setSpeed((byte)5);
	}
	
	public void switchOff() {
		this.isOn= false;
		setSpeed((byte)0);
	}
	
	public void setSpeed(byte Speed) {
		this.speed=Speed;
	}
	 
	
	public String toString() {

	return String.format("make - %s,radius - %f,color - %s,isOn - %b, speed - %d ",make,radius,color,isOn,speed);
	}
}
