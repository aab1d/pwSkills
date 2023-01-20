package Assignment20;

//Q1 - Given a number n, print the following pattern without using any loop.
//n, n-5, n-10, ..., 0, 5, 10, ..., n-5, n
import java.util.Scanner;

public class RecSeries {
    static void pattern (int n, int original, boolean middle) {
        if(n <= 0)  middle = true;
        if(n - 5 == original) return;
        System.out.print(n + " ");
        if(middle) {
            pattern(n + 5, original, true);
        }
        else{
            pattern(n - 5, original, false);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        pattern(num, num, false);
    }
}
