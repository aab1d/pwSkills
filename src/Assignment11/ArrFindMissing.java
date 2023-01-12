package Assignment11;

//Q3 - Given an array arr[] of size N-1 with integers in the range of [1, N], the task is to find the
//missing number from the first N integers. There are no duplicates in the list.
import java.util.Scanner;

public class ArrFindMissing {
        static int findMissing(int[] arr) {
            int n = arr.length + 1;
            int totalSum = n * (n + 1) / 2;
            int arrSum = 0;
            for (int i : arr) {
                arrSum += i;
            }
            return  totalSum - arrSum;
        }

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n-1];
        System.out.println("Enter elements of array: ");
        for (int i = 0; i < n-1; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Missing number: " + findMissing(arr));
    }
}
