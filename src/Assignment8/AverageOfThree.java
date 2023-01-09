package Assignment8;

import java.util.Scanner;

//This program gives the average of three numbers using a method.
public class AverageOfThree {
    static int averageOfThree(int a, int b, int c) {
        return (a + b + c) / 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(averageOfThree(a, b, c));

    }
}
