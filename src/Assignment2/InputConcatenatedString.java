package Assignment2;

//This program takes two strings as inputs and prints them in a single-line.
import java.util.Scanner;

public class InputConcatenatedString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two strings:");
        String firstString = s.nextLine();
        String secondString = s.nextLine();
        System.out.println(firstString + secondString);
    }
}
