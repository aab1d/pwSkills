package Assignment2;

//This program takes input as marks (max 100) in 3 subjects and gives the percentage of the user.
import java.util.Scanner;

public class InputMarksPercentage {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the marks attained in 3 subjects: ");
        int sub1 = s.nextInt();
        int sub2 = s.nextInt();
        int sub3 = s.nextInt();
        int totalMarks = sub1 + sub2 + sub3;
        int totalPercentage = totalMarks * 100 / 300;
        System.out.println("Total Marks are "+ totalMarks);
        System.out.println("Total percentage in 3 subjects is " + totalPercentage + "%");
    }
}
