package Assignment5;

//This program calculates the factorial of a number.
import java.util.Scanner;

public class LoopsFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int inputNum = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= inputNum; i++) {
            fact *= i;
        }
        System.out.println("The factorial of " + inputNum + " is " + fact);
    }
}
