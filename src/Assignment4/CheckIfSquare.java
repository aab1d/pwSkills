package Assignment4;

//This program takes two integer inputs as length and breadth and checks whether the shape is square or not.
import java.util.Scanner;

public class CheckIfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length: ");
        int x = sc.nextInt();
        System.out.println("Enter breadth: ");
        int y = sc.nextInt();
        if(x == y) {
            System.out.println("It is a square");
        }
        else System.out.println("It is a rectangle");
    }
}
