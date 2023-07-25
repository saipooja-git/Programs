package java_new_programs;

public class FanRunner {

	public static void main(String[] args) {
		
		Fan fan = new Fan("manufacturer",0.84676,"BLUE");
		fan.switchOn();
		System.out.println(fan);
		fan.setSpeed((byte)3);
		System.out.println(fan);
		fan.switchOff();
		System.out.println(fan);
		
		
	}
}
// output:-
// make - manufacturer,radius - 0.846760,color - BLUE,isOn - true, speed - 5 
// make - manufacturer,radius - 0.846760,color - BLUE,isOn - true, speed - 3 
// make - manufacturer,radius - 0.846760,color - BLUE,isOn - false, speed - 0 
