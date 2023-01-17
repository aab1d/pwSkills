package Assignment15;

//Q4. Given a 2D array for n rows and m columns, reverse each row.
import java.util.Scanner;

public class MatReverseRow {
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
        System.out.println("Enter row length of matrix: ");
        int r = sc.nextInt();
        System.out.println("Enter column length of matrix: ");
        int c = sc.nextInt();
        System.out.println("Enter elements of matrix: ");
        int[][] mat = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        reverseRows(mat);
        System.out.println("The reversed matrix is: ");
        printMatrix(mat);
    }
}
