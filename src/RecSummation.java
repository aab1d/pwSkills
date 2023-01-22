import java.util.Scanner;

//This recursive program gives the sum of numbers from 1 up-to 'n' (entered by user).
public class RecSummation {
    static int summation(int n) {
        if(n == 0) {
            return n;
        }
        return n + summation(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(summation(n));
    }
}
