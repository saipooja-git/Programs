package java_new_programs; 

public class Practice {
    public static void main(String[] args)
    {
 
    	for(int a=35;a<45;a+=5) {
    		for(int b =100;b>15;b/=2) {
    			System.out.println(b+" ");
    		}
    		System.out.println("a ="+a);
    	}
    	System.out.println("THE END");//
}
}
/**    public static void main(String[] args) {
        int[][] data = {
            {50, 5, 10, 15},
            {2, 8, 7, 1},
            {3, 56, 9, 12}
        };
        
        displayAsRows(data);
        findMaxInEachRow(data);
    }

    public static void displayAsRows(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void findMaxInEachRow(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            int max = array[i][0]; // Assume the first element is the maximum

            for (int j = 1; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }

            System.out.println("Max in row " + (i + 1) + ": " + max);
        }
    }
}

	/** public static void main(String[] args) {
		         String s = "Kansas city";
	         
		         int countOfN = 0;

		         for (int i = 0; i < s.length(); i++) {
	             if (s.charAt(i) == 'n' || s.charAt(i) == 'N') {
		                 countOfN++;
	             }
		         }

		         System.out.println("Count of 'n' in 'Kansas city': " + countOfN);
		     }
		 }

	 
	 
/**
		 String s = "Kansas city";
	        String stringWithoutSpaces = s.replaceAll("\\s", "");
	        Map<Character, Integer> charCount = new HashMap<>();
	        for(int i=0;i<stringWithoutSpaces.length();i++) {
	                char currentChar = stringWithoutSpaces.charAt(i);
	                charCount.put(currentChar, charCount.getOrDefault(currentChar, 0) + 1);
	            }

	            // Display the character counts
	            for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
	                System.out.println("Character: " + entry.getKey() + ", Count: " + entry.getValue());

	        	}
	        }
	 }

	 /** public static void main(String[] args) {

			        int[][] data = {
			                {85, 70},
			                {62, 39},
			                {55, 30},
			                {88, 68},
			                {45, 27},
			                {18,  6}
			        };

			        displayAsColumns(data);
			    }

			    public static void displayAsColumns(int[][] array) {
			        int rows = array.length;
			        int cols = array[0].length;

			        // Print column headers
			       // System.out.println("Column 1\tColumn 2");

			        // Print the data in columns
			        for (int i = 0; i < rows; i++) {  // for (int i = 0; i < array.length; i++)
			            for (int j = 0; j < cols; j++) { //for (int j = 0; j < array.length; j++)
			               // System.out.print(array[i][j] + "\t");
			            }
			        }
			        int sum = 0;
  
			        // Calculate the sum of the first column
			        for (int i = 0; i < rows; i++) {
			            sum += array[i][0];
			        }

			        System.out.println("The total number of free throws shot is: " + sum);

			    }
			}
	        

   /** public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int sum = 0;
        int i =1;
        while (true) {
            System.out.println("Enter an integer or 0 to quit");
            int num = s.nextInt();

            if (num == 0) {
                // Break the loop if the user enters 0
                break;
            } else {
                sum += num; // Accumulate the sum
                i++;
            }
        }

        System.out.println("Sum of entered numbers: " + sum);
        s.close();
    }
}

/**
 * package java_new_programs;
import java.util.Scanner;
public class Practice {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the values");
		int n = s.nextInt();
int sum=0;
for(int i =0;i<=n;i++) {
				System.out.println("Enter an integer or 0 to quit");
				int num = s.nextInt();

	            if (num == 0) {
	                // Break the loop if the user enters 0
	                break;
	            } else {
	                sum += num; // Accumulate the sum
	            }
	        }

	        System.out.println("Sum of entered numbers: " + sum);
				s.close();
		
	}

}

/**
Enter the values
4
Enter an integer or 0 to quit
2
Enter an integer or 0 to quit
4
Enter an integer or 0 to quit
6
Enter an integer or 0 to quit
0
Sum of entered numbers: 12
*/
 
