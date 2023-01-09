//This program takes an input and prints the value if it is either divisible by 3 or 5.
import java.util.Scanner;

public class ConditionalOprOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        if(num % 3 == 0 || num % 5 == 0) {
            System.out.println("Found number - "+ num);
        }
    }
}

