package Assignment17;

//Q1 - Given a matrix arr[][] of integers, print the prefix sum matrix for it.
import java.util.Scanner;

public class MatPrefixSum {
    static void prefixSumMatrix(int[][] mat, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(i == 0 && j == 0)    continue;
                else if(i == 0) mat[i][j] += mat[i][j-1];
                else if(j == 0) mat[i][j] += mat[i-1][j];
                else mat[i][j] += mat[i][j - 1] + mat[i - 1][j];
            }
        }
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
        System.out.println("Enter row and column length for the matrix (respectively): ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("Enter "+ r*c +" elements for matrix: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        prefixSumMatrix(arr, r, c);
        printMatrix(arr);
    }
}
