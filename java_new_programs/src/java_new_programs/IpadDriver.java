package java_new_programs;


public class IpadDriver {

	public static void main(String[] args) {

	Ipad i = new Ipad();
	System.out.println(i.toString());
	System.out.println("Perimeter of Ipad is "+i.perimeterOfIpad());
	System.out.println("Volume of Ipad is "+i.volumeOfIpad());
	Ipad i1 = new Ipad(7,9,3);
	System.out.println(i1.toString());
	System.out.println("Perimeter of Ipad is "+i1.perimeterOfIpad());
	System.out.println("Volume of Ipad is "+i1.volumeOfIpad());
	
	}

}
