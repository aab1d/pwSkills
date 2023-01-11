package Assignment10;

//Q4 - Given an unsorted array A of size N that contains only non-negative integers,
//find a continuous sub-array which adds to a given number S.
//In case of multiple sub-arrays, return the sub-array which comes first on moving from left to right.
//You need to print the start and end index of answer sub-array.
import java.util.Scanner;

public class ArrSumSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int n = sc.nextInt();
        System.out.println("Enter elements of array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter S: ");
        int s = sc.nextInt();

        int start = 0;
        int end;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            end = i;

            while (sum > s) {
                sum -= arr[start];
                start++;
            }

            if (sum == s) {
                System.out.println("First index: " + start);
                System.out.println("Last index: " + end);
                break;
            }
        }
    }
}
