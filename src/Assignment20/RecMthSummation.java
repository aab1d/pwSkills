package Assignment20;

//Q2 - Find m-th summation of first n natural numbers where m-th summation of first n natural
//numbers is defined as following:
//If m > 1: SUM(n, m) = SUM(SUM(n, m - 1), 1)
//Else :SUM(n, 1) = Sum of first n natural numbers.
import java.util.Scanner;

public class RecMthSummation {
    static int mthSummation(int n, int m) {
        if(m == 1) return (n * (n+1))/2;
        return mthSummation(mthSummation(n, m - 1), 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number and m respectively: ");
        int num = sc.nextInt();
        int m = sc.nextInt();
        System.out.println("Summation: ");
        System.out.println(mthSummation(num, m));
    }
}
