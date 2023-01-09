package Assignment6;

//This program converts a decimal double number into binary string for up to k precision digits.
import java.util.Scanner;

public class DoubleToBinary {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the decimal double number:");
        double doubleNum = scn.nextDouble();
        System.out.println("Enter the number of precision digits:");
        int k = scn.nextInt();
        int intPart = (int)doubleNum;
        double fractionPart = doubleNum - intPart;
        int decimalInt = 0;
        int power = 1;
        while(intPart != 0) {
            int rem = intPart % 2;
            decimalInt += rem * power;
            power *= 10;
            intPart /= 2;
        }
        StringBuilder s = new StringBuilder(decimalInt + ".");
        while(k > 0 && fractionPart != 0){
            fractionPart *= 2;
            int digit = (int)fractionPart;
            s.append(digit);
            fractionPart = fractionPart - digit;
            k--;
        }
        System.out.print(s);
    }
}
