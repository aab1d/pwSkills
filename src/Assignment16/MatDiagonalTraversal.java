package Assignment16;

//Q4 - Given n*m matrix, return an array of elements containing diagonal traversal of the matrix.
import java.util.Scanner;

public class MatDiagonalTraversal {
    static void printDiagonally(int[][] matrix) {
        for(int i = 0; i < matrix.length + matrix[0].length -1; i++) {
            for (int j = 0; j <= i; j++) {
                int k = i - j;
                if (k < matrix.length && j < matrix[0].length) {
                    System.out.print(matrix[k][j] + " ");
                }
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row and column length for the matrix (respectively): ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        System.out.println("Enter "+ n*m +" elements for  matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        printDiagonally(a);
    }
}
