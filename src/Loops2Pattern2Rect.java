/*Pattern Printing: Hollow Rectangular Pattern (user enters rows and cols)
 *  Example:
 *  ******
 *  *    *
 *  *    *
 *  ******
 *  (if u replace `*s` by column number (j), we'll get a Hollow Numeric Rectangular Pattern.
 * */
import java.util.Scanner;

public class Loops2Pattern2Rect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows (r) and columns (c) respectively:");
        int r = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("The (hollow) rectangular pattern is : ");
        for (int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                if(i == 0 || i == r-1 || j == 0 || j == c-1) {
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}
