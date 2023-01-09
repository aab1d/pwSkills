package Assignment8;

//This program prints the middle value of a string (2 if even length string).
import java.util.Scanner;

public class DisplayMiddleString {
    static String displayMiddle(String input) {
        int mid = input.length()/2;
        if(input.length() % 2 == 0) {
            return " " + input.charAt(mid) + input.charAt(mid + 1);
        }
        return input.charAt(mid + 1) + " ";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.next();
        System.out.println("Middle: " + displayMiddle(input));
    }
}
