package Assignment11;

//Q2 - Given an array of size n, find the total number of occurrences of given number x.
import java.util.Scanner;

public class ArrOccurrences {
    static int findOccurrences(int[] arr, int target) {
        int count = 0;
        for (int j : arr) {
            if (j == target) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter X: ");
        int x = sc.nextInt();
        int count = findOccurrences(arr, x);
        System.out.println("Occurrences = " + count);
    }
}
