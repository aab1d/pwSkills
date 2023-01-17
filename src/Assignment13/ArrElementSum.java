package Assignment13;

//Q4. Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order,
//find two numbers such that they add up to a specific target number.
//Return the indices of the two numbers added by one. Return -1 if pair does not exist.
import java.util.Scanner;
public class ArrElementSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter sum: ");
        int target = sc.nextInt();

        int i = 0;
        int j = n-1;
        boolean foundSum = false;
        while (i < j) {
            if(arr[i] + arr[j] == target) {
                foundSum = true;
                break;
            } else if(arr[i] + arr[j] > target)  j--;
            else    i++;
        }
        if(foundSum)    System.out.println("Indices are: " + ++i + " " + ++j);
        else    System.out.println(-1);
    }
}