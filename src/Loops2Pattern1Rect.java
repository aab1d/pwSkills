/*Pattern Printing: Rectangular Pattern (user enters rows and cols)
*   Example:
*   ******
*   ******
*   ******
* */
import java.util.Scanner;

public class Loops2Pattern1Rect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows (r) and columns (c) respectively:");
        int r = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("The rectangular pattern is : ");
        for (int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
