package Assignment3;

//This program takes input a 3-digit number and outputs the sum of the three digits of the number.
import java.util.Scanner;

public class SumOf3DigitNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 3-digit number: ");
        int input = sc.nextInt();
        int sumOf3Digits = input % 10;
        input /= 10;
        sumOf3Digits += input % 10;
        input /= 10;
        sumOf3Digits += input % 10;
        System.out.println("The sum of three digits are: " + sumOf3Digits);
    }
}
