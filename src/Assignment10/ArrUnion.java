package Assignment10;

//Q2 - Given two arrays a[] and b[] of size n and m respectively where m >= n.
//The task is to find union between these two arrays and print the number of elements of the union set.
//Union of the two arrays can be defined as the set containing distinct elements from both the arrays.
//If there are repetitions, then only one occurrence of element should be printed in the union.
import java.util.Scanner;

public class ArrUnion {
    public static int[] removeDuplicates(int[] input) {
        int j = 0;
        for (int i = 0; i < input.length; i++) {
            int current = input[i];
            boolean isDuplicate = false;
            for (int k = 0; k < i; k++) {
                if (current == input[k]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                input[j++] = current;
            }
        }
        int[] output = new int[j];
        System.arraycopy(input, 0, output, 0, j);
        return output;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of first array (n): ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter elements of array: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter length of second array (m >= n): ");
        int m = sc.nextInt();
        int[] b = new int[m];
        System.out.println("Enter elements of array: ");
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        System.out.println();
        int[] c = new int[m+n];
        System.arraycopy(a, 0, c,0,n);
        System.arraycopy(b, 0, c,n,m);

        System.out.println("Union is: ");
        int[] output = removeDuplicates(c);
        for (int i :
                output) {
            System.out.print(i + " ");
        }
    }
}
