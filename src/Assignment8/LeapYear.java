package Assignment8;

//This program checks whether the input year is a leap year or not, using a method.
import java.util.Scanner;

public class LeapYear {
    static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int inputYear = sc.nextInt();
        if(isLeapYear(inputYear)) System.out.println(inputYear + " is a leap year.");
        else System.out.println(inputYear + " is not a leap year.");
    }
}
