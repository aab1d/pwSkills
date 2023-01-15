package Assignment12;

//Q3. Minimum Platforms
//Given arrival and departure times of all trains that reach a railway station. Find the minimum number
//of platforms required for the railway station so that no train is kept waiting.
//Consider that all the trains arrive the same day and leave on the same day. Arrival and departure
//time can never be the same for a train, but we can have arrival time of one train equal to departure time
//of the other. At any given instance of time, same platform can not be used for both departure of a train
//and arrival of another train. In such cases, we need different platforms.
import java.util.Scanner;

public class ArrDepartureArrival {
    static int numPlatforms(int[] arrival, int[] departure) {
        int i = 1, j = 0;
        int platforms = 1;
        int result = 1;
        int n = arrival.length;
        while (i < n && j < n) {
            if (arrival[i] < departure[j]) {
                platforms++;
                i++;
                if (platforms > result) {
                    result = platforms;
                }
            } else {
                platforms--;
                j++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of trains: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] dep = new int[n];
        System.out.println("Enter arrival of trains in order: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter departure of trains in order: ");
        for (int i = 0; i < n; i++) {
            dep[i] = sc.nextInt();
        }
        int platforms = numPlatforms(arr, dep);
        System.out.println("Platforms needed = " + platforms);
    }
}
