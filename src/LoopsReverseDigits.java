/*This program takes an input number and gives the reverse of the number
 * example: 12345 -- > 54321
 * */
import java.util.Scanner;

public class LoopsReverseDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number (N):");
        int inputNum = sc.nextInt();
        int reverseNum = 0;
        while (inputNum != 0) {
            reverseNum = reverseNum * 10 + inputNum % 10;
            inputNum /= 10;
        }
        System.out.println("The reverse of the number is: " + reverseNum);
    }
}
