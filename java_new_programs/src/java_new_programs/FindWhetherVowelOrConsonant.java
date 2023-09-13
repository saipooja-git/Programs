package java_new_programs;
import java.util.Scanner;

public class FindWhetherVowelOrConsonant {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char input = s.next().charAt(0);
        Vowel_Or_Consonant(input);
        s.close();
    }

    public static void Vowel_Or_Consonant(char y) {
        if (y == 'a' || y == 'e' || y == 'i' || y == 'o' || y == 'u' ||
            y == 'A' || y == 'E' || y == 'I' || y == 'O' || y == 'U') {
            System.out.println("It's a vowel");
        } else {
            System.out.println("It's a consonant");
        }
    }
}
