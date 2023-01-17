package Assignment14;

//Q4. Given a 0-indexed integer array num, find the leftmost middleIndex
//(i.e., the smallest (Medium) amongst all the possible ones).
//A middleIndex is an index where num[0] + num[1] + ... + num[middleIndex-1] == num[middleIndex+1] +
//num[middleIndex+2] + ... + num[num.length-1].
//If middleIndex == 0, the left side sum is considered to be 0.
//Similarly, if middleIndex == num.length - 1, the right side sum is considered to be 0.
//Return the leftmost middleIndex that satisfies the condition, or -1 if there is no such index.
import java.util.Scanner;

public class ArrLeftmostMiddleIndex {
    static int leftMiddleIndex(int[] arr) {
        int n = arr.length;
        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        if (prefixSum[0] == prefixSum[n - 1]) return 0;
        for (int i = 1; i < n; i++) {
            if (prefixSum[i - 1] == prefixSum[n - 1] - prefixSum[i]) return i;
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
        System.out.println("Left Middle Index: " + leftMiddleIndex(arr));
    }
}
