package Assignment9;

//Q5. Find the first peak element in the array {1, 1, 3, 4, 2, 3, 5, 7, 0}
//Peak element is the one which is greater than its immediate left neighbor and its immediate right neighbor.
//Leftmost and rightmost element cannot be a peak element.
public class ArrPeakElements {
    static int findPeakOf(int[] arr) {
        int peak = arr[1];
        //rightmost and leftmost elements are excluded in the loops.
        for (int i = 2; i < arr.length-1; i++) {
            if (arr[i] > arr[i-1] && arr[i] > arr[i+1]) {
                //if the previous peak is lesser, then it is replaced.
                if (arr[i] > peak)  peak = arr[i];
            }
        }
        return peak;
    }

    public static void main(String[] args) {
        int[] a = {1, 1, 3, 4, 2, 3, 5, 7, 0};
        System.out.println("Peak Element is: " + findPeakOf(a));
    }
}
