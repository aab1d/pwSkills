package Assignment5;

//This program checks whether a prime Number can be expressed as a Sum of Two Prime Numbers.
import java.util.Scanner;

public class LoopsSumOfPrimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a prime number: ");
        int num = scanner.nextInt();

        // Check if the number is even
        if (num % 2 == 0) {
            // If the number is even, it cannot be expressed as the sum of two prime numbers
            System.out.println(num + " cannot be expressed as the sum of two prime numbers.");
        } else {
            // If the number is odd, check if it can be expressed as the sum of two prime numbers
            if (isSumOfPrimes(num)) {
                System.out.println(num + " can be expressed as the sum of two prime numbers.");
            } else {
                System.out.println(num + " cannot be expressed as the sum of two prime numbers.");
            }
        }
    }

    public static boolean isSumOfPrimes(int num) {
        for (int i = 2; i < num / 2; i++) {
            if (isPrime(i) && isPrime(num - i)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
