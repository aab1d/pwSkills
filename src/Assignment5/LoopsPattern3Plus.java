package Assignment5;
/*Pattern Printing: Plus Sign Pattern
*   *
*   *
* *****
*   *
*   *
* */
public class LoopsPattern3Plus {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 2 || j == 2) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}
