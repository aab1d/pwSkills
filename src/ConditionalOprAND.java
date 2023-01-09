//This program takes an input and prints the value if it is both even and divisible by 3.
import java.util.Scanner;

public class ConditionalOprAND {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if(num % 2 == 0 && num % 3 == 0) {
            System.out.println("Found number - "+ num);
        }
    }
}
