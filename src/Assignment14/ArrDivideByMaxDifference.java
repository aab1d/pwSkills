package Assignment14;

//Q1. Given an array of integers of length n, and an integer m, (m < n), divide the array into
//2 sub-arrays such that 1 part contains m elements and the other part contains the rest of
//the elements. This division has to be done such that the difference between the sum of
//elements of both the sub arrays is the maximum. You have to print the maximum difference
//in the sum possible.
import java.util.Arrays;
import java.util.Scanner;

public class ArrDivideByMaxDifference {
    static int maxDifferenceOfSubArrays(int[] arr, int div) {
        Arrays.sort(arr);
        int n = arr.length;
        int sumSub1 = 0;
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
            if(i == div - 1) sumSub1 = totalSum;
        }
        return totalSum - (sumSub1 * 2);    //total - sumSub1 gives sumSub2, sumSub2 - sumSub1 = maxDifference
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
        System.out.println("Enter max number of elements in one sub-array: ");
        int m = sc.nextInt();
        System.out.println("Max Difference: " + maxDifferenceOfSubArrays(arr, m));
    }
}
