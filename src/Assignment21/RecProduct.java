package Assignment21;

//Q2 - Given two number x and y find product using recursion.
import java.util.Scanner;

public class RecProduct {
    static int productTwo(int x, int y) {
        if(y == 1)  return x;
        return x + productTwo(x, y - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers (x and y): ");
        System.out.println(productTwo(sc.nextInt(), sc.nextInt()));
    }
}
