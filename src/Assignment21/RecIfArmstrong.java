package Assignment21;

//Q1 - Given a number n. Print if it is an armstrong number or not.
//An armstrong number is a number if the sum of every digit in that number raised to the power
//of total digits in that number is equal to the number.
//Example : 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153 hence 153 is an armstrong number.
import java.util.Scanner;

public class RecIfArmstrong {
    static int sumCubeDigits(int n) {
        if (n == 0) return 0;
        int cube = n % 10;
        return (cube * cube * cube) + sumCubeDigits(n / 10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if(sumCubeDigits(num) == num)  System.out.println("Yes");
        else System.out.println("No");
    }
}
