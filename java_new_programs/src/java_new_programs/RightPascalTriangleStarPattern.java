package java_new_programs;
import java.util.Scanner;
public class RightPascalTriangleStarPattern {

	public static void main(String[] args) {

        Scanner n = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
 
        int rows = n.nextInt();        
        for (int i= 0; i<= rows-1 ; i++)
        {
            for (int j=0; j<=i; j++) { System.out.print("*"+ " "); } System.out.println(""); } for (int i=rows-1; i>=0; i--)
        {
            for(int j=0; j <= i-1;j++)
            {
                System.out.print("*"+ " ");
            }
            System.out.println("");
        }
n.close();
	}

}
