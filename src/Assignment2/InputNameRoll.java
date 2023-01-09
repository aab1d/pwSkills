package Assignment2;

//This program takes input as name, roll no, and field of interest (in a single-line format) and outputs them.
import java.util.Scanner;

public class InputNameRoll {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name, roll no. and field of interest respectively:");
        String firstName = s.next();
        String lastName = s.next();
        int rollNo = s.nextInt();
        String fieldOfInterest = s.next();
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Field of Interest: " + fieldOfInterest);
    }
}
