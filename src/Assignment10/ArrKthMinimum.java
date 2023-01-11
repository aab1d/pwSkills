package Assignment10;

import java.util.Arrays;
import java.util.Scanner;

//Q3 - Given an array arr[] and an integer K where K is smaller than size of array,
//the task is to find the smallest (Kth) element in the given array.
//It is given that all array elements are distinct.
public class ArrKthMinimum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter K:");
        int k = sc.nextInt();
        if(k <= n && k > 0) {
            Arrays.sort(arr);
            System.out.println("The kth smallest element is: " + arr[k-1]);
        }
        else System.out.println("K is out of bounds of the array.");
    }
}
