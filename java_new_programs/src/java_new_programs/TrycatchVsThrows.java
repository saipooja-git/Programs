package java_new_programs;

public class TrycatchVsThrows {
	public static void Wait() throws InterruptedException {
		for(int i =1;i<=10;i++) {
			System.out.println(i);
			Thread.sleep(1000);
		}
		
	}

	public static void main(String[] args){  

		try {
		Wait();
		System.out.println(10/0);
		}
		catch(Exception e) {
		System.out.println("exception handled");
		}
		System.out.println("main method ended");
	}
	

}

/**
 public static void Wait() throws InterruptedException {
		for(int i =1;i<=10;i++) {
			System.out.println(i);
			Thread.sleep(1000);
		}
		
	}

	public static void main(String[] args) throws InterruptedException{ // while using this way of handling exception 
		//through throws keyword there is no guarantee program executes till end so keep  a printing statement at last.

		Wait();
		System.out.println("main() ended");
	}

 
*/