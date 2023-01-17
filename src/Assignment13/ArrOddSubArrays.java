package Assignment13;

//Q2. Given an integer array arr, return the number of consecutive sequences(sub-arrays) with odd sum.
import java.util.Scanner;

public class ArrOddSubArrays {
    static int oddSubArrays(int[] arr) {
        int sum = 0;
        int odd = 0;
        int even = 0;
        for (int num : arr) {
            if (num % 2 == 1) {
                int temp = odd; //swap odd and even
                odd = even;
                even = temp;
                odd++;

            }
            else {
                even++;
            }
            sum += odd;
        }
        return sum;
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
        int ans = oddSubArrays(arr);
        System.out.println("Odd sub-arrays: " + ans);
    }
}
