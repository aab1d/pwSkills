package Assignment4;

//This program creates a calculator using switch statement to perform addition, subtraction, multiplication and division.
import java.util.Scanner;

public class SwitchCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the operator (+, -, *, /) :- ");
        char opr = sc.next().charAt(0);
        System.out.println("Enter two numbers");
        double a = sc.nextInt();
        double b = sc.nextInt();
        switch (opr) {
            case '+' -> System.out.println(a + " + " + b + " = " + (a+b));
            case '-' -> System.out.println(a + " - " + b + " = " + (a-b));
            case '*' -> System.out.println(a + " * " + b + " = " + (a*b));
            case '/' -> System.out.println(a + " / " + b + " = " + (a/b));
            default -> System.out.println("Error! The operator is not correct");
        }
    }
}
