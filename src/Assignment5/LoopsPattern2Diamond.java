package Assignment5;
/*Pattern Printing: Alphabet Diamond Pattern
*     A
*    ABC
*   ABCDE
*  ABCDEFG
* ABCDEFGHI
*  ABCDEFG
*   ABCDE
*    ABC
*     A
* */
public class LoopsPattern2Diamond {
    public static void main(String[] args) {
        int r = 5;
        //upper half (1 to 5)
        for (int i = 0; i < r; i++) {
            char letter = 'A';
            for (int j = 0; j < r-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= 2*i; j++) {
                System.out.print(letter++);
            }
            System.out.println();
        }
        //lower half (line 6 to 9)
        for (int i = r-1; i > 0; i--) {
            char letter = 'A';
            for (int j = 0; j <= r-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i-1; j++) {
                System.out.print(letter++);
            }
            System.out.println();
        }
    }
}
