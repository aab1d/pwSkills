package Assignment12;

//Q1. Given an array arr[] of size n, find the first repeating element. The element should occur more than
//once and the index of its first occurrence should be the smallest. If no repeating element exists, print -1.
//(Assume 1 based indexing)
import java.util.Scanner;

public class ArrFirstRepeating {
    static int firstRepeating(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]) return i+1;    //since 1 based indexing
            }
        }
        return -1;
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
        System.out.println("First index of first repeating element is: " + firstRepeating(arr));
    }
}
