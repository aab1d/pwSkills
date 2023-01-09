package Assignment6;

//This program takes input in binary and produces output in decimal number system.
import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number in Binary:");
        int inputNum = sc.nextInt();
        int decimalNum = 0;
        int i = 1;      //base multiplier (2^0 = 1)
        while(inputNum != 0) {
            decimalNum += (inputNum % 10) * i;
            inputNum /= 10;
            i *= 2;
        }
        System.out.println("Decimal Number is : " + decimalNum);
    }
}
