package Assignment2;

/* This program takes two input strings with whitespaces line-by-line (no fixed amount),
concatenates the two strings of each line and gives the output in the same way as input.
 */
import java.util.Scanner;

public class InputConcatenateLineStrings {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        while(scn.hasNextLine()){
            String a = scn.next();
            String b = scn.next();
            System.out.println(a+b);
        }
    }
}
