package Assignment9;

//Q1. Given an array of integers {2, 6, -5, -1, 0, 4, -9}, print only the positive values present in the array.
public class ArrPositiveValues {
    static void displayPositiveOnly (int[] arr) {
        for (int j : arr) {
            if (j >= 0) {
                System.out.println(j);
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {2, 6, -5, -1, 0, 4, -9};
        System.out.println("Only Positive Values are: ");
        displayPositiveOnly(a);
    }
}
