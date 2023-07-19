package java_new_programs;
import java.math.BigDecimal;
import java.util.Scanner;

public class PersonDetailsUsingStringPrgram {

	public static void main(String[] args) {
		//int[] marks= {100,98,95,98};
		int k ;
		int[] marks = new int[5];
		Scanner s = new Scanner(System.in);
		System.out.println("Enter how many subjects:");
        k= s.nextInt();
        marks = new int[k];
        System.out.println("Enter marks:");
        for (int i = 0; i < k ; i++) {
            marks[i] = s.nextInt();
        }
		Student student = new Student(" Angel ", marks);
		
		int number =student.getNumberOfMarks();
		System.out.println("Number of Marks:"+ number);
		
		int sum = student.getTotalSumOfMarks();
		System.out.println("Total marks:"+ sum);
		
		int maximum = student.getMaximumMarks();
		System.out.println("Maximum marks:"+ maximum);
		
		int minimum = student.getMinimumMarks();
		System.out.println("Minimum marks are:"+ minimum);
			
		BigDecimal average = student.getAverageMarks();
		System.out.println("Average marks:"+average);
		
		
		
	}

}
