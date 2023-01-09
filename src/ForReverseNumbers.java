//This program takes a natural number (N) and prints in all natural numbers from N to 1 in reverse order
import java.util.Scanner;

public class ForReverseNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a natural number (N > 0):");
        int n = sc.nextInt();
        System.out.println(n + " to 1 list: ");
        for (int i = n; i > 0; i--){
            System.out.println(i);
        }
    }
}
