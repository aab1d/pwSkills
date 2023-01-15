package Assignment12;

//Q2. Given an array of positive and negative numbers, arrange them in an alternate fashion such that
//every positive number is followed by a negative and vice-versa maintaining the order of appearance.
//The number of positive and negative numbers need not be equal. Begin with a negative number.
//If there are more positive numbers, they appear at the end of the array.
//If there are more negative numbers, they too appear at the end of the array.
import java.util.Scanner;

public class ArrArrangePosNeg {
    static int[] arrangeNegativePositive(int[] arr) {
        int[] ans = new int[arr.length];
        int j = 0;
        int k = 0;
        boolean isNegative = true;
        for (int value : arr) {
            if (isNegative) {
                if (value < 0) {
                    ans[j++] = value;
                    isNegative = false;
                } else {
                    ans[arr.length - ++k] = value;
                }
            } else {
                if (value >= 0) {
                    ans[j++] = value;
                    isNegative = true;
                } else {
                    ans[arr.length - ++k] = value;
                }
            }
        }
        return ans;
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
        int[] ans = arrangeNegativePositive(arr);
        for (int j:
             ans) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
