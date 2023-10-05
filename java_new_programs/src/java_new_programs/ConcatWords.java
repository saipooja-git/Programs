package java_new_programs;
import java.util.Scanner;

public class ConcatWords {

    public static void main(String[] args) {
        StringBuilder sentence = new StringBuilder();
        Scanner s = new Scanner(System.in);
        System.out.println("Type a word to add to your sentence. Type 'end' when done.");

        String input;
        while (!(input = s.nextLine()).equals("end")) {
            sentence.append(input).append(" ");
            System.out.println("Type a word to add to your sentence. Type 'end' when done.");
        }

        String str = sentence.toString().trim();
        System.out.println(str);
        System.out.print("Enter the letter to count: ");
        char countChar = s.next().charAt(0); // Read the character to count

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == countChar) {
                count++;
            }
        }

        System.out.println("The number of '" + countChar + "'s is: " + count);

        int divisibleBySixCount = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 6 == 0) {
                divisibleBySixCount++;
            }
        }

        System.out.println("There are " + divisibleBySixCount + " numbers divisible by 6 between 1 and 100.");

        s.close();
    }
}

/***
Type a word to add to your sentence. Type 'end' when done.
I
Type a word to add to your sentence. Type 'end' when done.
like
Type a word to add to your sentence. Type 'end' when done.
learning
Type a word to add to your sentence. Type 'end' when done.
java
Type a word to add to your sentence. Type 'end' when done.
end
I like learning java
Enter the letter to count: l
The number of 'l's is: 2
There are 16 numbers divisible by 6 between 1 and 100.

 */
 
