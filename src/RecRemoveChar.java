import java.util.Scanner;

//This program removes the letter 'b' from an input string and prints the rest string as it is
public class RecRemoveChar {
    static String removedB(String input) {
        if(input.length() == 0) return "";
        char c = input.charAt(0);
        String smallString = removedB(input.substring(1));
        if (c == 'b')   return smallString;
        return c + smallString;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.next();
        String ans = removedB(input);
        System.out.println(ans);
    }
}
