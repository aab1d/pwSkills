package Assignment17;

//Q2. A square matrix is said to be a perfect Matrix if both of the following conditions hold:
//a) All the elements in the diagonals of the matrix are non-zero integers.
//b) All other elements except the diagonal elements are 0.
//Given a 2D integer array grid of size n*n representing a square matrix, return true if grid is a perfect matrix.
//Otherwise, return false.
import java.util.Scanner;

public class MatPerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of matrix: ");
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        System.out.println("Enter "+ n*n +" elements for matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        boolean isPerfect = true;
        outer: for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean diagonal = i == j || i + j == n - 1;
                if ((diagonal && mat[i][j] == 0) || (!diagonal) && mat[i][j] != 0) {
                    isPerfect = false;
                    break outer;
                }
            }
        }
        System.out.println("Is perfect Matrix: " + isPerfect);
    }
}
