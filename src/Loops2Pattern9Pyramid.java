/*Pattern Printing: Pyramid Pattern (user enters rows)
 *   Example:
 *     *
 *    * *
 *   *   *
 *  *******
 *  (for Numerical pyramid(1), just replace the `*` in line x with row number (i)
 *  Example:
 *     0
 *    1 1
 *   2   2
 *  3333333
 *  )
 *  (for Numerical pyramid(2), see commented code from line 40
 *  Example:
 *     0
 *    0 0
 *   0   0
 *  0123210
 * */
import java.util.Scanner;

public class Loops2Pattern9Pyramid {
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
                if(j == 0 || j == 2*i || i == 0 || i == r-1)    System.out.print("*");
                else System.out.print(" ");
            }
//            print numbers
//            for (int j = 0; j < i; j++) {
//                if (j == 0 || i == r-1) System.out.print(j);
//                else System.out.print(" ");
//            }
//            for (int j = i; j >= 0; j--) {
//                if (j == 0 || i == r-1) System.out.print(j);
//                else System.out.print(" ");
//            }
            System.out.print("\n");
        }
    }
}
