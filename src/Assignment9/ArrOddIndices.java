package Assignment9;

//Q2. Convert the list of Strings {“ab”, “bc”, “cd”, “de”, “ef”, “fg”, “gh”} into an array of strings
//and print all strings stored on odd indices of the array.
public class ArrOddIndices {
    static void displayOddIndices(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(i % 2 != 0) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        String[] list = {"ab", "bc", "cd", "de", "ef", "fg", "gh"};
        System.out.println("Values at odd indices are: ");
        displayOddIndices(list);
    }
}
