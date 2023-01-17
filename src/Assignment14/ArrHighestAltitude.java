package Assignment14;

import java.util.Scanner;

public class ArrHighestAltitude {
    static int highestAltitude(int[] arr) {
        int n = arr.length;
        int maxAlt = 0;
        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i-1] + arr[i];
            if(maxAlt < prefixSum[i])   maxAlt = prefixSum[i];
        }
        return maxAlt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of points: ");
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        System.out.println("Enter 'gain' array elements: ");
        arr[0] = 0;     //first point is zero
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Highest Altitude: " + highestAltitude(arr));
    }
}
