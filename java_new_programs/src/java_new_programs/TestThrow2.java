package java_new_programs;
import java.io.*;  

public class TestThrow2 {
	  
	  
	    //function to check if person is eligible to vote or not   
	    public static void method() throws FileNotFoundException {  
	  
	        FileReader file = new FileReader("C:\\Users\\HOME\\abc.txt");  
	        BufferedReader fileInput = new BufferedReader(file);  
	  
	      
	        throw new FileNotFoundException();  
	      
	    }  
	    //main method  
	    public static void main(String args[]){  
	        try  
	        {  
	            method();  
	        }   
	        catch (FileNotFoundException e)   
	        {  
	            e.printStackTrace();  
	        }  
	        System.out.println("rest of the code...");    
	  }    
	}    


/**
class UserDefinedException extends Exception  
{  
    public UserDefinedException(String str)  
    {  
        // Calling constructor of parent Exception  
        super(str);  
    }  
}  
// Class that uses above MyException  
public class TestThrow3  
{  
    public static void main(String args[])  
    {  
        try  
        {  
            // throw an object of user defined exception  
            throw new UserDefinedException("This is user-defined exception");  
        }  
        catch (UserDefinedException ude)  
        {  
            System.out.println("Caught the exception");  
            // Print the message from MyException object  
            System.out.println(ude.getMessage());  
        }  
    }  
}   
**/