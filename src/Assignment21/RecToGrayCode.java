package Assignment21;

/*
Q5 - Given the Binary code of a number as a decimal number, we need to convert this into its
equivalent Gray Code.
In gray code, only one bit is changed in 2 consecutive numbers.
Hint: The Most Significant Bit (MSB) of the gray code is always equal to the MSB of the given
binary code and other bits of the output gray code can be obtained by XORing binary code bit
at that index and previous index.
*/

import java.util.Scanner;

public class RecToGrayCode {
    public static void printGrayCode(int n) {
        if(n == 0)  return;
        int j = n % 10;
        n /= 10;
        printGrayCode(n);
        if (n % 10 == j) System.out.print(0);
        else System.out.print(1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        printGrayCode(num);
    }
}
