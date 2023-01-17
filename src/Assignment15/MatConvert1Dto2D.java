package Assignment15;

//Q2. Convert a 1D sorted array of length n*m to a 2D array of n rows and m columns.
//The matrix should also be sorted.
import java.util.Scanner;

public class MatConvert1Dto2D {
    static int[][] toMatrix(int[] arr, int rows, int cols) {
        int[][] mat = new int[rows][cols];
        int k = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = arr[k++];
            }
        }
        return mat;
    }
    static void printMatrix(int[][] mat) {
        for (int[] ints : mat) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements of array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter m and n for the matrix respectively: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        if(m * n != size) {
            System.out.println("Conversion not possible, size of matrix and array need to be same.");
            return;
        }
        int[][] ans = toMatrix(arr, m, n);
        System.out.println("The corresponding matrix is: ");
        printMatrix(ans);
    }
}
