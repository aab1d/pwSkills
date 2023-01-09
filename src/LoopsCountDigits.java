/*This program takes input as a number (N) and gives the number of digits present in the number.
* example: 12345 = 1,2,3,4,5 = 5 digits
* */

import java.util.Scanner;

public class LoopsCountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number (N):");
        int inputNum = sc.nextInt();
        int numOfDigits = 0;
        while(inputNum != 0) {
            inputNum /= 10;
            numOfDigits++;
        }
        System.out.printf("The number of digits in the number are: "+ numOfDigits);
    }
}
