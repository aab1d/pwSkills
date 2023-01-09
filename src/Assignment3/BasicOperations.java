package Assignment3;

/*This program takes an input int X, does the following operations to the previous result in order and produces output:
* Adding 8, dividing by 3, taking modulus of the quotient with 5, and finally multiplying by 5.
*  */
import java.util.Scanner;

public class BasicOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number on which the operations are to be performed: ");
        int x = sc.nextInt();
        int output  = (((x + 8) / 3) % 5 ) * 5;
        System.out.println("The output is: " + output);
    }
}
