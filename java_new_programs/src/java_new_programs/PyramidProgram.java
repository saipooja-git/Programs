package java_new_programs;

public class PyramidProgram {

	public static void main(String[] args) {
		int i,j;

        for (i=0; i<5; i++) //outer loop for number of rows(n) 
        	{ 
        	for (j=5-i; j>1; j--) //inner loop for spaces
        	
        { 
            System.out.print(" "); //print space
        }  
        for (j=0; j<=i; j++ ) //inner loop for number of columns
        { 
            System.out.print("* "); //print star
        } 

        System.out.println(); //ending line after each row
        	}

	}

}
