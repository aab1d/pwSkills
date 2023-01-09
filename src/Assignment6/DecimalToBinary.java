package Assignment6;

//This program takes input in decimal and produces output in binary number system.
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number in Decimal:");
        int inputNum = sc.nextInt();
        int binaryNum = 0;
        int i = 1;      //base multiplier (10^0 = 1)
        while(inputNum != 0) {
            binaryNum += (inputNum % 2) * i;
            inputNum /= 2;
            i *= 10;
        }
        System.out.println("Binary Number is : " + binaryNum);
    }
}
