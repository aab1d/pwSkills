package Assignment13;

//Q3. You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints
//of the ith line are (i, 0) and (i, height[i]).
//Find two lines that together with the x-axis form a container, such that the container contains the most water.
//Return the maximum amount of water a container can store.
import java.util.Scanner;

public class ArrMostWater {
    static int maxStorage(int[] arr) {
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        int storage = 0;
        int height, width;
        while (i < j) {
            if(j == i+1) {
                i++;
                j = n - 1;
            }
            height = arr[j];
            if(arr[i] < arr[j]) height = arr[i];
            width = j - i;
            if(height * width > storage) storage = height * width;
            j--;
        }
        return storage;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of vertical lines: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter length of vertical lines: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Max water that can be stored in sq. unit: " + maxStorage(arr));
    }
}
