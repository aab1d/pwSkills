package Assignment16;

//Q1 - Given two integer matrices, multiply the matrices, if possible, else return “Invalid Input”.
import java.util.Scanner;

public class MatMultiplication {
    static int[][] multiplicationMatrix(int[][] a, int r1, int c1, int[][] b, int c2) {
        int[][] mul = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    mul[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return mul;
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
        System.out.println("Enter row and column length for first matrix (respectively): ");
        int n1 = sc.nextInt();
        int m1 = sc.nextInt();
        System.out.println("Enter row and column length for second matrix (respectively): ");
        int n2 = sc.nextInt();
        int m2 = sc.nextInt();
        if(m1 != n2) {
            System.out.println("Invalid input");
            return;
        }

        int[][] a = new int[n1][m1];
        int[][] b = new int[n2][m2];
        System.out.println("Enter "+ n1*m1 +" elements for first matrix: ");
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m1; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter "+ n2*m2 +" elements for second matrix: ");
        for (int i = 0; i < n2; i++) {
            for (int j = 0; j < m2; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        int[][] ans = multiplicationMatrix(a, n1, m1, b, m2);
        System.out.println("The multiplication matrix is: ");
        printMatrix(ans);
    }
}
