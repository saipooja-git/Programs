package java_new_programs;
import java.io.*;  
// exception not occured
	class B{  
	 void method()throws IOException{  
	  System.out.println("device operation performed");
	  //   throw new IOException("device error");  when ther is an exception 

	 }  
	}  
	public class TestThrows3{  
	   public static void main(String args[])throws IOException{//declare exception  
	     B m=new B();  
	     m.method();  
	  
	    System.out.println("normal flow...");  
	  }  
	}  


