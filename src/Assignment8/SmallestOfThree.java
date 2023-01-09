package Assignment8;

import java.util.Scanner;

public class SmallestOfThree {
    static int smallest(int a, int b, int c) {
        int small = a;
        if (b < small) {
            small = b;
        }
        if (c < small) {
            small = c;
        }
        return small;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        System.out.println("The smallest of three is " + smallest(x,y,z));
    }
}
