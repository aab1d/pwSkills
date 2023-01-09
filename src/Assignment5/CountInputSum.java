package Assignment5;

/*This program takes input as integer numbers till the user wants,
* the numbers can be positive,negative or zero.
* The sum of numbers is calculated until a negative number is encountered.
* If the input is a negative number, current sum is discarded -1 is printed.
* */
import java.util.Scanner;

public class CountInputSum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        int sum = 0;
        while (scn.hasNextInt()) {
            int num = scn.nextInt();
            if (num >= 0) {
                sum += num;
            } else {
                sum = -1;//input is negative so change sum to -1 and break out of the loop
                break;
            }
        }
        System.out.print("Sum is: " + sum);
    }
}
