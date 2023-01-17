package Assignment13;

//Q5. Given an array sorted in increasing order, return an array of squares of each number sorted in
//increasing order. ([-4, -2, 0, 1, 3] --> [0, 1, 4, 9, 16])
import java.util.Scanner;

public class ArrSquaresSorted {
    static void reverseArray(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i <= j) {
            if (arr[i] > arr[j]) {
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
            i++;
            j--;
        }
    }
    static int[] sortSquares(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        int i = 0;          //first index
        int j = n - 1;      //last index
        int k = 0;          //iterator of answer array
        while(i <= j) {
            if(Math.abs(arr[i]) > Math.abs(arr[j])) {
                ans[k++] = arr[i] * arr[i];
                i++;
            }
            else {
                ans[k++] = arr[j] * arr[j];
                j--;
            }
        }
        reverseArray(ans);
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
        int[] sorted = sortSquares(arr);
        for (int item:
             sorted) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
