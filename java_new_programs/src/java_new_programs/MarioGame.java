package java_new_programs;

public class MarioGame implements GamingConsole{

	@Override
	public void up() {

		System.out.println("move up");
	}

	@Override
	public void down() {

		System.out.println("down stairs");
	}

	
	@Override
	public void left() {

		System.out.println("left left");
	}

	@Override
	public void right() {
        System.out.println("right right");		
	}
	
	

}
