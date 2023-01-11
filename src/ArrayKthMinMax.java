import java.util.Arrays;
import java.util.Scanner;

/*This program takes input as integer array, and returns an array with two elements.
* The first & second elements contain the kth minimum value and maximum values respectively.
* Here is an example to illustrate what the program would do:
* Take integer array input (say [1, 3, 45, 2, 42, 12, 9]) and k (say 3)
* (The ordered array would be [1, 2, 3, 9, 12, 42, 45])
* Now, make an array of two elements (3rd minimum & 3rd maximum value here)
* (3rd minimum: 3 and 3rd maximum: 12)
* Print the array with kth minimum and maximum values (i.e, [3, 12])
* */
public class ArrayKthMinMax {
    static int[] scanArray(int length) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    static void printArray(int[] arr) {
        for (int element :
                arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    //this function returns an array of the kth maximum and minimum value
    static int[] kthMinMaxArrayOf(int[] arr, int k) {
        if (k == 0) k = 1;
        Arrays.sort(arr);
        int kMin = k - 1;
        int kMax = arr.length - k;
        return new int[]{arr[kMin], arr[kMax]};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        int[] inputArr = scanArray(n);
        System.out.println("Enter k: ");
        int k = sc.nextInt();
        System.out.println("Entered array is: ");
        printArray(inputArr);
        System.out.println(k + "th minimum and maximum array is:");
        printArray(kthMinMaxArrayOf(inputArr, k));
    }
}
