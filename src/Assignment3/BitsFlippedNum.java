package Assignment3;

//This program finds the total number of bits needed to be flipped to convert x to y.
import java.util.Scanner;

public class BitsFlippedNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of x : ");
        int x = sc.nextInt();
        System.out.println("Enter value of y : ");
        int y = sc.nextInt();
        int exOr = x ^ y;
        int ans = 0;
        while (exOr != 0) {
            ans += exOr % 2;
            exOr /= 2;
        }
        System.out.println("The number of bits that need to be flipped are: " + ans);
    }
}
