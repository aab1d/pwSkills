package Assignment2;

/* This program takes two types of inputs:
 1) an integer which gives the count of pairs of numbers for addition.
 2) two integer pairs for addition
 and gives output sum of the pair of integers line-by-line.
 */
import java.util.Scanner;

public class InputSumOfTwo {
    public static void main(String[] args) {
        int[] sumArray = new int[10];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of lines: ");
        int numberOfLines = s.nextInt();
        System.out.println("Enter the two numbers for addition.");
        for(int i = 0; i < numberOfLines; i++){
            int a = s.nextInt();
            int b = s.nextInt();
            sumArray[i] = a + b;
        }
        for(int i = 0; i < numberOfLines; i++){
            System.out.println(sumArray[i]);
        }
    }
}
