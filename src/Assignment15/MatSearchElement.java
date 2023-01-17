package Assignment15;

//Q1. Check if an element x exists in the given matrix or not.
//If it does not exist, return -1, else return its row and column index.
import java.util.Scanner;

public class MatSearchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row length of matrix: ");
        int r = sc.nextInt();
        System.out.println("Enter column length of matrix: ");
        int c = sc.nextInt();
        int i, j = 0;
        System.out.println("Enter elements of matrix: ");
        int[][] mat = new int[r][c];
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter element to find: ");
        int x = sc.nextInt();
        boolean found = false;
        outer: for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                if (mat[i][j] == x) {
                    found = true;
                    break outer;
                }
            }
        }
        if (found)   System.out.println("Found at: " + i + " " + j);
        else System.out.println(-1);
    }
}
