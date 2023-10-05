package java_new_programs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class MissingElements {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());
        while (t > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] array = new int[n - 1];
            for (int i = 0; i < n - 1; i++) {
                array[i] = Integer.parseInt(str[i]);
            }
            MissingNumber sln = new MissingNumber();
            System.out.println(sln.missingNumber(array, n));
            t--;
        }
    }
}

class MissingNumber {
    int missingNumber(int array[], int n) {
        int sumOfElements = 0;
        for (int num : array) {
            sumOfElements += num;
        }
        int expectedSum = (n * (n + 1)) / 2;
        int missingNumber = expectedSum - sumOfElements;
        return missingNumber;
    }
}
