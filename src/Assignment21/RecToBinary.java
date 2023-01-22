package Assignment21;

//Q4 - Given a decimal number input, we need to write a program to convert the given
//decimal number into its equivalent binary number.
import java.util.Scanner;

public class RecToBinary {
    static void printBinary(int decimal) {
        if(decimal == 0)    return;
        printBinary(decimal/2);
        System.out.print(decimal % 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dec = sc.nextInt();
        printBinary(dec);
    }
}
