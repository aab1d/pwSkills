import java.util.Scanner;

//This program prints the sum of integers unless the user enters -1, then it exits the program.
public class DoWhileSumInputStream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter natural numbers you want to add. Enter -1 to exit :");
        int sum = 0;
        int inputNum;
        do {
            inputNum = sc.nextInt();
            sum += inputNum;
        }while (inputNum != -1);
        System.out.println("The total sum of numbers is: "+ sum);
    }
}
