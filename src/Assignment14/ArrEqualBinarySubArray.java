package Assignment14;

//Q2. Given an integer array arr consisting of 0’s and 1’s only, return the max length of sequence
//which contains equal numbers of 0 and 1. If no such sub-array exists, print -1.
import java.util.Scanner;

public class ArrEqualBinarySubArray {
    static int equalBitsSubSize(int[] arr) {
        int zero = 0;
        int one = 0;
        for (int j : arr) {
            if (j == 0) {
                zero++;
            } else one++;
        }
        if (zero == 0 || one == 0) return -1;
        if(zero < one)  return 2 * zero;    //e.g, if 2 zeroes and 4 ones, the return should be 4 (2 0's & 2 1's)
        else return 2 * one;
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
        System.out.println("Size: " + equalBitsSubSize(arr));
    }
}
