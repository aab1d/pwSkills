//This program prints sum of first N natural numbers using a while loop.
import java.util.Scanner;

public class WhileSumNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of natural numbers (N):");
        int n = sc.nextInt();
        int i = 1, sum = 0;
        while(i != n + 1) {
            sum += i;
            i++;
        }
        System.out.println("The sum of "+ n +" natural numbers is "+ sum);
    }
}
