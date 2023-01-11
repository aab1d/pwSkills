package Assignment10;

//Q1 - Given an unsorted array arr[] of size N having both negative and positive integers, place
//all negative elements at the end of array without changing the order of positive elements
//and negative elements
import java.util.Scanner;

public class ArrPositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] outArr = new int[n];
        int j = 0;  //separate variable to iterate through outArr
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                outArr[j] = arr[i];
                j++;    //only iterate if positive number found
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                outArr[j] = arr[i];
                j++;
            }
        }
        System.out.println("Output: ");
        for (int element:
                outArr) {
            System.out.print(element + " ");
        }
    }
}
