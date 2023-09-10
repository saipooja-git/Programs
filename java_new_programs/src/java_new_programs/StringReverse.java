package java_new_programs;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
       // String input = "Saipooja";
    	Scanner s = new Scanner(System.in);
    	System.out.println("Enter a String: ");
    	String input = s.next();
        String reversed = reverseString(input);
        System.out.println("Reversed String is :"+reversed);
        s.close();

    }

    public static String reverseString(String input) {
        StringBuffer sb = new StringBuffer(input);
        return sb.reverse().toString();
    }
}

/**
Enter a String: 
12344556788
Reversed String is :88765544321
**/

/*
 package java_new_programs;

public class StringReverse {


    public static void main(String[] args) {
        String input = "Saipooja";
        String reversed = reverseString(input);
        System.out.println(reversed);
    }

    public static String reverseString(String input) {
        StringBuffer sb = new StringBuffer(input);
        return sb.reverse().toString();
    }
}

 */
/*
 public class StringReverse{
 public static void main(String[] args){
 StringBuffer sb1 = new StringBuffer("SaiPooja Reddy");
 System.out.println(sb1.reverse());
 
 StringBuilder sb2 = new StringBuilder("Palle");
 System.out.println(sb2.reverse());
 }
 }
 */
 
/* int l;
String str = "Blessings";
String s2= " ";
l=str.length();
for(int i = l-1;i>=0;i++){
 s2= s2+str.charAt(i);
 System.out.println(s2);
 }
 } */
 
 

 
