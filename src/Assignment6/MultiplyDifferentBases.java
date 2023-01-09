package Assignment6;

//This program multiplies two numbers given in different base (Decimal and Binary)
import java.util.Scanner;

public class MultiplyDifferentBases {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Decimal Number:");
        int decimalNum = sc.nextInt();
        System.out.println("Enter Binary Number :");
        int binaryNum = sc.nextInt();
        int decBinary = 0;
        int i = 1;      //base multiplier (2^0 = 1)
        while(binaryNum != 0) {
            decBinary += (binaryNum % 10) * i;
            binaryNum /= 10;
            i *= 2;
        }
        int sum = decimalNum * decBinary;
        System.out.println("Product: \n" + sum);
    }
}
