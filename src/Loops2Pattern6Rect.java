/*Pattern Printing: Numerical Rectangular Pattern (user enters rows and cols)
 *   Example:
 *   0123
 *   1230
 *   2301
 *   3012
 * */
import java.util.Scanner;

public class Loops2Pattern6Rect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of rows (r) and columns (c) respectively:");
        int r = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("The (numerical) rectangular pattern is:");
        for(int i = 0; i < r; i++) {
            for (int j = i; j < c; j++) {
                System.out.print(j);
            }
            for (int j = 0; j < i; j++)
            {
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }
}
