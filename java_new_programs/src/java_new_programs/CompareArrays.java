package java_new_programs;

public class CompareArrays {

    public static void main(String[] args) {

        int a[] = {10, 12, 15, 22, 28};
        int b[] = {34, 98, 87, 67, 98};

        int result = compareArrays(a, b);
        if (result < 0) {
            System.out.println("a is lexicographically less than b");
        } else if (result > 0) {
            System.out.println("a is lexicographically greater than b");
        } else {
            System.out.println("a is equal to b");
        }
    }

    public static int compareArrays(int[] a, int[] b) {
        int minLength = Math.min(a.length, b.length);

        for (int i = 0; i < minLength; i++) {
            if (a[i] < b[i]) {
                return -1;
            } else if (a[i] > b[i]) {
                return 1;
            }
        }

        // If the common elements are equal, compare the array lengths
        return Integer.compare(a.length, b.length);
    }
}
// Arrays.compare() method is not available for arrays of primitive types like int[]. It is only available for arrays of reference types (e.g., String[], Object[]).
// if index i in aray a is less than b, it prints "a is lexicographically less than b"
// if index i in array a is greaer than b,it prints "a is lexicographically greater than b"
// if these both above mentioned methods doesnot work oly then it checks length of a nd b, if a length is smaller than b it returns -1 else 1 when a"s length is greater than b [using intger.compare(a.length,b.length)] 