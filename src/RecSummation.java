import java.util.Scanner;

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
