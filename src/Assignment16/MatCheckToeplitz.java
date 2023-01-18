package Assignment16;

//Q3 - Given a n*m matrix, return true if the matrix is a Toeplitz matrix.
//A matrix is called Toeplitz if every diagonal from top-left to bottom-right has the same elements.
import java.util.Scanner;

public class MatCheckToeplitz {
    static boolean isToeplitz(int[][] mat, int rows, int cols) {
        for (int i = 0; i < rows - 1; i++) {
            for (int j = 0; j < cols - 1; j++) {
                if(mat[i][j] != mat[i+1][j+1])  return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row length of matrix: ");
        int n = sc.nextInt();
        System.out.println("Enter column length of matrix: ");
        int m = sc.nextInt();
        System.out.println("Enter elements of matrix: ");
        int[][] mat = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Is Toeplitz: " + isToeplitz(mat, n, m));
    }
}
