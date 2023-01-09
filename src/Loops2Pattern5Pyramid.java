/*Pattern Printing: Pyramid Pattern (user enters rows)
 *   Example:
 *     *
 *    ***
 *   *****
 *  *******
 *  (for Numerical pyramid, see commented code from line 27)
 * */
import java.util.Scanner;

public class Loops2Pattern5Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows (r): ");
        int r = sc.nextInt();
        System.out.println("The pyramid pattern is: ");

        for (int i = 0; i < r; i++) {
            //print spaces
            for (int j = 0; j < r-i; j++) {
                System.out.print(" ");
            }
            //print stars
            for (int j = 0; j <= 2*i; j++) {
                System.out.print("*");
            }
            //print numbers
//            for (int j = 0; j < i; j++) {
//                System.out.print(j);
//            }
//            for (int j = i; j >= 0; j--) {
//                System.out.print(j);
//            }
            System.out.print("\n");
        }
    }
}
