package java_new_programs;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int a[] = new int[6];
        System.out.println("Enter the numbers");
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            a[i] = s.nextInt();
        }
        Arrays.sort(a);
        for (int i = 0; i < 6; i++) {
            System.out.print(a[i] + " ");
        }
        int key = a[3];
        int index = Arrays.binarySearch(a, key);
        if (index >= 0) {
            System.out.println("\n" + key + " found at index " + index);
        } else {
            System.out.println("\n" + key + " not found");
        }
        s.close();
    }
}
