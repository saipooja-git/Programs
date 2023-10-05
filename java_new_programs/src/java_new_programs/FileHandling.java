package java_new_programs;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {
	// addimd content to existing content
    public static void main(String[] args) throws IOException {
        
            String filepath ="C:\\Users\\HOME\\git\\Programs\\java_new_programs\\src\\java_new_programs\\poojacreatedfile.txt";
            FileWriter f = new FileWriter(filepath,true);

            String newData = "Along with java, python is on boom";


            f.write(newData);
            f.close();
            System.out.println("Data appended successfully...!");
           

    }
}




 
 /**

 .............now using trycatch we created file.......
 File f = new File("C:\\Users\\HOME\\git\\Programs\\java_new_programs\\src\\java_new_programs\\file.txt");
		try {
		if(f.createNewFile()) { //here is an shows an error as  unhandled IOException so to handle two ways one//
			//by try-catch another by throws keyword
			System.out.println("File successfully created....!");
		}
		else {
			System.out.println("File Already exists...!");
		}
	}

		catch(IOException e) {
			System.out.println("Exception handled...!");
		}
		output:- File successfully created....!
		
		
	----------------------------------------------------------------------------------------------------------------------
		throws keyword 
			
			public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\HOME\\git\\Programs\\java_new_programs\\src\\java_new_programs\\file.txt");
		
		if(f.createNewFile()) { //here is an shows an error as  unhandled IOException so to handle two ways one//
			//by try-catch another by throws keyword
			System.out.println("File successfully created....!");
		}
		else {
			System.out.println("File Already exists...!");
		}
		// File Already exists...! note:- as already we created file with try catch block 
//so the same exception using throws when executed it shows file already exists..
---------------------------------------------------------------------------------------------
// dsplay the file information when there is no information 
	public static void main(String[] args) throws IOException {

		File f = new File("C:\\Users\\HOME\\git\\Programs\\java_new_programs\\src\\java_new_programs\\file.txt");
		
		if(f.exists()) { //here is an shows an error as  unhandled IOException so to handle two ways one//
			//by try-catch another by throws keyword
			System.out.println("File name:"+f.getName());
			System.out.println("File Location: "+ f.getAbsolutePath());
			System.out.println("File Writable: "+ f.canWrite());
			System.out.println("File Readable: "+f.canRead());
			System.out.println("File size: "+f.length());
		}
		else {
			System.out.println("File doesnot exists...!");
		}
	
	}

}
/*File name:file.txt
File Location: C:\Users\HOME\git\Programs\java_new_programs\src\java_new_programs\file.txt
File Writable: true
File Readable: true
File size: 0
-------------------------------------------------------------------------------------------------
// dsplay the file information when there is some information entred and saved 
	public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\HOME\\git\\Programs\\java_new_programs\\src\\java_new_programs\\file.txt");

        if(f.exists()) { 
        	System.out.println("File name:"+f.getName());
			System.out.println("File Location: "+ f.getAbsolutePath());
			System.out.println("File Writable: "+ f.canWrite());
			System.out.println("File Readable: "+f.canRead());
			System.out.println("File size: "+f.length());
		}
		else {
			System.out.println("File doesnot exists...!");
		
        	
        }
File name:file.txt
File Location: C:\Users\HOME\git\Programs\java_new_programs\src\java_new_programs\file.txt
File Writable: true
File Readable: true
File size: 30
-----------------------------------------------------------------------------------------------------------------
// write in  a file
	public static void main(String[] args) throws IOException {
		
		
        FileWriter f = new FileWriter("C:\\Users\\HOME\\git\\Programs\\java_new_programs\\src\\java_new_programs\\file.txt");
        

       try {
    	   f.write("Java is a language which ia always used......!");
       }
      
       catch(IOException i) {
    	   System.out.println(i);
       }
       finally {
    	   f.close();
    	   System.out.println("Successfully written..!");
       }
       -----------------------------------------------------------------------------------------------------------------
public static void main(String[] args) throws IOException {
        FileInputStream f = null;

        try {
            // Specify the path to the file you want to read
            String filePath = "C:\\Users\\HOME\\git\\Programs\\java_new_programs\\src\\java_new_programs\\file.txt";

            // Create a FileInputStream to read the file
            f = new FileInputStream(filePath);

            // Read and process the file contents
            int byteData;
            while ((byteData = f.read()) != -1) {
                // Process the byte here (you can print or save it)
                System.out.print((char) byteData);
            }
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            if (f != null) {
                f.close();
            }
            System.out.println("\nFile read completed.");
        }
        
        
       Java is a language which ia always used......!
       File read completed.
       ---------------------------------------------------------------------------------------------------------------
       //read the content in the file
    public static void main(String[] args) throws IOException {
    	try {
       FileReader r = new FileReader("C:\\Users\\HOME\\git\\Programs\\java_new_programs\\src\\java_new_programs\\file.txt");
        try {
        	int i;
        	while((i=r.read())!=-1) {
        		System.out.print((char)i);
         }
    	}
        finally {
        	r.close();
        
        }
    	}
        catch (IOException e) {
            System.out.println("Exception handled");
        }
            System.out.println("\nFile read completed.");
            Java is a language which ia always used......!
            File read completed.
            ------------------------------------------------------------------------------------------------------------------
            //read the content in the file
    public static void main(String[] args) throws IOException {
       FileReader r = new FileReader("C:\\Users\\HOME\\git\\Programs\\java_new_programs\\src\\java_new_programs\\file.txt");
       
        	int i;
        	while((i=r.read())!=-1) {
        		System.out.print((char)i);
        
           
        }
        	Java is a language which ia always used......!

    ---------------------------------------------------------------------------------------------------------------------------
    // using buffer reader
    // Read the content in the file using readLine()
    public static void main(String[] args) throws IOException {
        BufferedReader r = null;
        
        try {
            // Specify the path to the file you want to read
            String filePath = "C:\\Users\\HOME\\git\\Programs\\java_new_programs\\src\\java_new_programs\\file.txt";

            // Create a BufferedReader to read the file
            r = new BufferedReader(new FileReader(filePath));

            String line;
            while ((line = r.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e);
        } finally {
           
                r.close();
            
            System.out.println("File read completed.");
        }
        
        Java is a language which ia always used......!
   		File read completed.
   		--------------------------------------------------------------------------------------------------------------------
   		// file rename
    public static void main(String[] args) throws IOException {
        
            File f =new File( "C:\\Users\\HOME\\git\\Programs\\java_new_programs\\src\\java_new_programs\\file.txt");
            File f2 =new File( "C:\\Users\\HOME\\git\\Programs\\java_new_programs\\src\\java_new_programs\\fileToNewFile.txt");


            if(f.exists()) {
            	System.out.println(f.renameTo(f2));
            }
            else {
            	System.out.println("File Doesn't Exists....!");
            }
          
        System.out.println(f2.getName());
        true
        fileToNewFile.txt
        -----------------------------------------------------------------------------------------------------------------
        public class FileHandling {
	// file copying to another file
    public static void main(String[] args) throws IOException {
        
            FileInputStream f =new FileInputStream( "C:\\Users\\HOME\\git\\Programs\\java_new_programs\\src\\java_new_programs\\fileToNewFile.txt");
            FileOutputStream f2 =new FileOutputStream( "C:\\Users\\HOME\\git\\Programs\\java_new_programs\\src\\java_new_programs\\poojacreatedfile.txt");


            int i;
           while((i=f.read())!=-1) {
        	   f2.write((char)i);
           }
    	   System.out.println("Data copied successfully....!");
        -------------------------------------------------------------------------------
        // adding content to existing content using file writer
    public static void main(String[] args) throws IOException {
        
            String filepath ="C:\\Users\\HOME\\git\\Programs\\java_new_programs\\src\\java_new_programs\\poojacreatedfile.txt";
            FileWriter f = new FileWriter(filepath,true);

            String newData = "Along with java, python is on boom";


            f.write(newData);
            f.close();
            System.out.println("Data appended successfully...!");
            -------------------------------------------------------------------------------------------------------------
        // adding content to existing content using file writer and file outputstream

            package java_new_programs;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class AppendToFile {
    public static void main(String[] args) throws IOException {
        // Specify the path to the file you want to append data to
        String filePath = "C:\\Users\\HOME\\git\\Programs\\java_new_programs\\src\\java_new_programs\\file.txt";

        // Data to append to the file
        String newData = "This is new data to be added to the file.\n";

        // Create a FileOutputStream in append mode
        FileOutputStream fos = new FileOutputStream(filePath, true);

        // Create a FileWriter based on the FileOutputStream
        FileWriter writer = new FileWriter(fos.getFD());

        // Write the new data to the file
        writer.write(newData);

        // Close the FileWriter
        writer.close();

        System.out.println("Data appended to the file.");
    }
}

           
*/
	

