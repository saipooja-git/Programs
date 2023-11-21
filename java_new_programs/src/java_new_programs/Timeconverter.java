package java_new_programs;

import java.util.Scanner;

public class Timeconverter {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the hours.....");
		int hours=s.nextInt();
		int minutes = convertHoursToMinutes(hours);
		System.out.println( hours +" hours consists of "+ minutes +" minutes");
		
		System.out.println("Enter the number of days.....");
		int days = s.nextInt();
		minutes=convertDaysToMinutes(days);
		System.out.println( days +" days consists of "+ minutes +" minutes");

		s.close();
		//
		
	}
		
		public static int convertHoursToMinutes(int hours) {
				
		    if(hours>0) {
		     int minutes = hours*60;
		        return minutes;
		    		}else{
		    			return -1;
		    		}
		}
		
	    public static int convertDaysToMinutes(int days) {
	        // Your task: complete this method
	        if(days > 0){
	int minutes=(days*60)*60;
	        return minutes;
	    }else {
	        return -1;
	    }
	}
	}

