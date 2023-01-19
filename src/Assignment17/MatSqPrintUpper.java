package Assignment17;

//Q3. Write a user defined function upper() which takes an integer square matrix as an input
//and its size N and prints the upper half of the matrix.
import java.util.Scanner;

public class MatSqPrintUpper {
    static void printUpper(int[][] mat, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(j >= i)  System.out.print(mat[i][j] + " ");
                else System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of square matrix: ");
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        System.out.println("Enter "+ n*n +" elements for matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        printUpper(mat, n);
    }
}
