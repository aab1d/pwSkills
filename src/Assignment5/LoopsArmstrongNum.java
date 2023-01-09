package Assignment5;

/*This program prints all Armstrong numbers between 1 to n.
* A three-digit number is called the Armstrong number if the sum of the cube of its digit is equal to the number itself.
* E.g.- 153 is an Armstrong number because (1^3)+(5^3)+(3^3) = 153.
* */
import java.util.Scanner;

public class LoopsArmstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int sum = 0;
            int j = i;
            while (j > 0) {
                sum += (j % 10) * (j % 10) * (j % 10);
                j /= 10;
            }
            if (sum == i) System.out.println(sum);
        }
    }
}
