package Assignment11;

//Q1 - Given an array sorted in increasing order of size n and an integer x,
//find if there exists a pair in the array whose absolute difference is exactly x.(n>1)
import java.util.Scanner;

public class ArrElementDifference {
    static boolean pairExist(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] - arr[i] == target) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array: (increasing order)");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target difference to find: ");
        int x = sc.nextInt();
        if(pairExist(arr, x)) System.out.println("Yes");
        else    System.out.println("No");
    }
}
