package Assignment15;

//Q3. Given a 2D array of n rows and m columns,
//return the sum of elements along the range of row and column specified.
import java.util.Scanner;

public class MatReturnRangeSum {
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
        System.out.println("Enter the start range (row, col): ");
        int rStart = sc.nextInt();
        int cStart = sc.nextInt();
        System.out.println("Enter the end range (row, col): ");
        int rEnd = sc.nextInt();
        int cEnd = sc.nextInt();

        int sum = 0;
        for (int i = rStart; i <= rEnd; i++) {
            for (int j = cStart; j <= cEnd; j++) {
                sum += mat[i][j];
            }
        }
        System.out.println("The sum is : " + sum);
    }
}
