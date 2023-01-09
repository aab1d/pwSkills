package Assignment5;

/*This program prints a triangle of prime numbers up to given number of lines of the triangle.
*      2
*     3 5
*    7 11 13
*   17 19 23 29
*  31 37 41 43 47
* 53 59 61 67 71 73
* */
import java.util.Scanner;

public class LoopsPattern4Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows (r): ");
        int r = sc.nextInt();
        int num = 2;
        for (int i = 0; i < r; i++) {
            //print spaces
            for (int j = 0; j < r-i; j++) {
                System.out.print(" ");
            }
            //print primes
            for (int j = 0; j <= i;) {
                boolean isPrime = true;
                for (int k = 2; k <= Math.sqrt(num); k++) {
                    if (num % k == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    j++;
                    System.out.print(num + " ");
                }
                num++;
            }
            System.out.print("\n");
        }
    }
}
