package Assignment4;

//This program takes an integer value and returns the absolute value of the number (unsigned value).
import java.util.Scanner;

public class PrintAbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int input = sc.nextInt();
        System.out.println("The absolute value is: ");
        if  (input < 0) {
            input *= -1;
        }
        System.out.println(input);
    }
}
