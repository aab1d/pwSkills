import java.util.Scanner;

public class RecTotalDigits {
    static int totalDigits(int n) {
        if (n == 0) return 0;
        return 1 + totalDigits(n /10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(totalDigits(num));
    }
}
