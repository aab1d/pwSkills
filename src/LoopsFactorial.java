//Print the first N factorial numbers, i.e, factorial of each number up to N.
import java.util.Scanner;

public class LoopsFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int fact = 1;
        for(int i = 1; i <= n; i++) {
            fact *= i;
            System.out.println("The factorial of " + i + " is: " + fact);
        }
    }
}
