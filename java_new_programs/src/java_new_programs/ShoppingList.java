package java_new_programs;
import java.util.Scanner;
  public class ShoppingList {
	  public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  System.out.print("Enter the original price: $");
		  float op = sc.nextFloat();

		  System.out.print("Enter the discount percentage: ");
		   float dp = sc.nextFloat();

		        // Calculate the discount amount
		   Float da = (dp * op) / 100 ;

		        // Calculate the final price after discount
		   float fp = op - da;

		        System.out.println("Original price: $" + op);
		        System.out.println("Discount Percentage: " + dp + "%");
		        System.out.println("Discount Amount: $" + da);
		        System.out.println("Final Price after Discount: $" + fp);

		        // Close the scanner
		        sc.close();
		    }
		

	}
  /*
Enter the original price: $50.0
Enter the discount percentage: 20.0
Original price: $50.0
Discount Percentage: 20.0%
Discount Amount: $10.0
Final Price after Discount: $40.0
   */
  
 /*** package java_new_programs;
  import java.util.Scanner;

  public class ShoppingList {
      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

          System.out.print("Enter the original price: $");
          int op = sc.nextInt();

          System.out.print("Enter the discount percentage: ");
          int dp = sc.nextInt();

          // Calculate the discount amount
          int da = (dp * op) / 100;

          // Calculate the final price after discount
          int fp = op - da;

          System.out.println("Original price: $" + op);
          System.out.println("Discount Percentage: " + dp + "%");
          System.out.println("Discount Amount: $" + da);
          System.out.println("Final Price after Discount: $" + fp);

          // Close the scanner
          sc.close();
      }
  }
  ***/


