package Assignment4;

/*This program calculates grades based on the marks given. Conversion rule is given below:
*    Marks : Grades
* 100 - 90 : A+
*  90 - 80 : A
*  80 - 70 : B+
*  70 - 60 : B
*  60 - 50 : C
*  50 - 40 : D
*  40 - 30 : E
*  30 -  0 : F
* */
import java.util.Scanner;

public class CalculateGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Marks: ");
        int marks = sc.nextInt();
        System.out.print("\nYour Grade is: ");
        if (marks <= 100 && marks > 90 ) {
            System.out.println("A+");
        } else if (marks <= 90 && marks > 80 ) {
            System.out.println("A");
        } else if (marks <= 80 && marks > 70 ) {
            System.out.println("B+");
        } else if (marks <= 70 && marks > 60 ) {
            System.out.println("B");
        } else if (marks <= 60 && marks > 50 ) {
            System.out.println("C");
        } else if (marks <= 50 && marks > 40 ) {
            System.out.println("D");
        } else if (marks <= 40 && marks > 30 ) {
            System.out.println("E");
        } else if (marks <= 30 && marks >= 0 ) {
            System.out.println("F");
        }
    }
}
