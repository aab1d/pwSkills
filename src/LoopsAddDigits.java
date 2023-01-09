/*This program takes an input number and gives the sum of the digits of the number
* example: 12345 -- 1 + 2 + 3 + 4 + 5 = 15
* */

import java.util.Scanner;

public class LoopsAddDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number (N):");
        int inputNum = sc.nextInt();
        int sum = 0;
        while (inputNum != 0) {
            sum += inputNum % 10;
            inputNum /= 10;
        }
        System.out.println("The sum of digits of the number are: " + sum);
    }
}
