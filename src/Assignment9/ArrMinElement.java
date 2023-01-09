package Assignment9;

//Q4. Calculate the minimum element in the array {2, -3, 5, 8, 1, 0, -4} using standard library method
//for calculating the minimum element.
public class ArrMinElement {
    static int displayMinimum(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min)  min = arr[i];
        }
        return min;
    }

    public static void main(String[] args) {
        int[] a = {2, -3, 5, 8, 1, 0, -4};
        System.out.println("Minimum element is: " + displayMinimum(a));
    }
}
