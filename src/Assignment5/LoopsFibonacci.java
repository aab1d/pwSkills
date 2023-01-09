package Assignment5;

//This program prints Fibonacci series up to n terms where n is input by user.
import java.util.Scanner;

public class LoopsFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter limit: ");
        int n = sc.nextInt();
        int x = 1;
        int y = 1;
        for (int i = 0; i < n; i++) {
            if (i < 2) System.out.print(x + " ");
            else {
                int fib = x + y;
                System.out.print(fib + " ");
                if (i % 2 == 0) x = fib;
                else y = fib;
            }
        }
    }
}
