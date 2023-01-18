package Assignment16;

//Q5 - Given an array of intervals where intervals[i] = [start, end], merge all overlapping intervals,
//and return the count of the non-overlapping intervals that cover all the intervals in the input.
import java.util.Scanner;
public class MatMergeIntervals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total intervals: ");
        int n = sc.nextInt();
        System.out.println("Enter interval length: ");
        int m = sc.nextInt();
        int[][] intervals = new int[n][m];
        System.out.println("Enter "+ n*m +" elements for  matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                intervals[i][j] = sc.nextInt();
            }
        }

        int count = 1;
        int end = intervals[0][1];
        for (int i = 1; i < n; i++) {
            if (end < intervals[i][0]) {
                count++;
                end = intervals[i][1];
            } else {
                end = Math.max(end, intervals[i][1]);
            }
        }
        System.out.println("Count of non-overlapping intervals: " + count);
    }
}

