//This program prints sum of first N natural numbers using a for loop.
import java.util.Scanner;

public class ForSumNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of natural numbers (N):");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 0;i < n+1; i++) {
            sum += i;
        }
        System.out.println("The sum of "+ n +" natural numbers is "+ sum);
    }
}
