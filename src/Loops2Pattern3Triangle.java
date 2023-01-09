/*Pattern Printing: Triangular Pattern (user enters rows)
 *  Example:
 *  *
 *  **
 *  ***
 *  ****
 *  (if u replace `*s` by column number(j), we'll get a Numeric Triangular Pattern.
 * */
import java.util.Scanner;

public class Loops2Pattern3Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows (r): ");
        int r = sc.nextInt();
        System.out.println("The triangular pattern is: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
