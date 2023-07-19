package java_new_programs;

import java.math.BigDecimal;

public class PersonDetailsUsingStringPrgram {

	public static void main(String[] args) {
		int[] marks= {100,98,95,90,98};
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
