//This program takes two inputs `a` and `b` and finds a raised to b (a^b).
import java.util.Scanner;

public class LoopsARaisedB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of A and B respectively: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int raised = 1;
        for(int i = 1; i <= b; i++) {
            raised *= a;
        }
        System.out.println(a + " raised to " + b + " is " + raised);
    }
}
