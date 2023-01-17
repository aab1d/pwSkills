package Assignment13;

//Q1. Given an integer m, n, and n integers, return true if the number of unique integers among the n integers is
//greater than or equal to m, else return false.(Integers appearing multiple times are all considered as 1 unique
//integer)
import java.util.Arrays;
import java.util.Scanner;

public class ArrUniqueIntegers {
    static boolean haveUniqueIntegers(int[] arr, int target) {
        int count = 0;
        int n = arr.length;
        Arrays.sort(arr);
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                count++;
                if(i == n - 2)  count ++;
            }
        }
        return count >= target;
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
        System.out.println("Enter the length of unique integers to find: ");
        int m = sc.nextInt();
        System.out.println(haveUniqueIntegers(arr, m));
    }
}
