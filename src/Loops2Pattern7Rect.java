/*Pattern Printing: Numerical Rectangular Pattern (user enters rows and cols)
 *   Example:
 *   0123
 *   0123
 *   0123
 *   0123
 * */
import java.util.Scanner;

public class Loops2Pattern7Rect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of rows (r) and columns (c) respectively:");
        int r = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("The (numerical) rectangular pattern is:");
        for(int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }
}
