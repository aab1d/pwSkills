package Assignment10;

//Q5 - Write a Java program to test the equality of two arrays.
import java.util.Scanner;
public class ArrEquality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of arrays: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of first array: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] b = new int[n];
        System.out.println("Enter the elements of first array: ");
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        boolean areEqual = true;
        for (int i = 0; i < n; i++) {
            if (a[i] != b[i]) {
                areEqual = false;
                break;
            }
        }
        System.out.println(areEqual);
    }
}
