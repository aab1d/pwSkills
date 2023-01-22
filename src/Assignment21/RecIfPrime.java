package Assignment21;

//Q3 - Given a number n, check whether it's a prime number or not using recursion.
import java.util.Scanner;

public class RecIfPrime {
    static boolean isPrime(int p, int q) {
        if (q < Math.sqrt(p)) return true;
        if (p % q == 0) return false;
        return isPrime(p, q - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(isPrime(num, num - 1));
    }
}
