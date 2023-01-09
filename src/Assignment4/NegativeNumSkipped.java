package Assignment4;

//This program prints positive number entered by the user, if user enters a negative number, it is skipped.
import java.util.Scanner;

public class NegativeNumSkipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int input = sc.nextInt();
        System.out.println("The absolute value is: ");
        if  (input < 0) {
            System.out.println("The number is negative and skipped");
        }
        else System.out.println("The number is: " + input);
    }
}
