/*Find the sum of the following series (N is the limit):
* S = 1 - 2 + 3 - 4 ... N
*  */
import java.util.Scanner;

public class LoopsSeriesSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit of series (N):");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if(i % 2 != 0) {
                sum += i;
            }
            else sum -=i;
        }
        System.out.println("Sum of the series upto " + n + " is: " + sum);
    }
}
