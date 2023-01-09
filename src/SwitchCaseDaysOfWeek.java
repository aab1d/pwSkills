//This program takes the day number (in a week i.e, 1-7) and prints the day name using switch-case.
import java.util.Scanner;

public class SwitchCaseDaysOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day number:");
        int inputDay = sc.nextInt();
        switch (inputDay) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid input");
        }
    }
}
