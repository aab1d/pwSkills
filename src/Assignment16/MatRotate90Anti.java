package Assignment16;

//Q2 - Given a square matrix, rotate it by 90 degrees in anti-clockwise direction.
import java.util.Scanner;

public class MatRotate90Anti {
    static void reverseArray(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    static void reverseRows(int[][] mat) {
        for (int[] ints : mat) {
            reverseArray(ints);
        }
    }
    static int[][] transpose(int[][] mat, int r, int c) {
        int[][] transpose = new int[c][r];
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                transpose[i][j] = mat[j][i];
            }
        }
        return transpose;
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
        int[][] a = new int[r][c];
        System.out.println("Enter "+ r*c +" elements for matrix: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        reverseRows(a);
        int[][] ans = transpose(a, r, c);
        System.out.println("After rotating 90 degrees anti-clockwise, matrix is: ");
        printMatrix(ans);
    }
}
