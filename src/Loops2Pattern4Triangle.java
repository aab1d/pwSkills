/*Pattern Printing: Triangular Pattern (user enters rows)
 *   Example:
 *   ****
 *   ***
 *   **
 *   *
 * */
import java.util.Scanner;

public class Loops2Pattern4Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows (r): ");
        int r = sc.nextInt();
        System.out.println("The (inverted) triangular pattern is: ");
        for (int i = 0; i < r; i++) {
            for (int j = r-i-1; j >= 0; j--) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
