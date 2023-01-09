package Assignment3;

//This program takes two inputs integers and swaps their values without using a third variable.
import java.util.Scanner;

public class SwapTwoWithout3rdVar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of two variables A and B respectively: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Before Swapping:");
        System.out.println("A is " + a + " and B is " + b);
        //swapping happens here
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping:");
        System.out.println("A is " + a + " and B is " + b);
    }
}
