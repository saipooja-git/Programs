package java_new_programs;
import java.util.Scanner;

public class ReverseWordsInAString {

	public static void main(String[] args) {

		String str;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String ");
		str = s.nextLine();

        StringBuilder builder = new StringBuilder(str);

		System.out.println(builder.reverse());
		 // Split the reversed string by space to get individual words
        String[] words = builder.toString().split(" ");

        // Create a new StringBuilder to store the reversed words
        StringBuilder reversedString = new StringBuilder();

        // Reverse each word and append it to the new StringBuilder
        for (String word : words) {
            StringBuilder wordBuilder = new StringBuilder(word);
            reversedString.append(wordBuilder.reverse()).append(" ");
        }

        // Remove the trailing space
        reversedString.deleteCharAt(reversedString.length() - 1);

        // Print the reversed string
        System.out.println("Reversed String: " + reversedString.toString());
		s.close();
		
	}

}
