package Assignment9;

//Q3. Traverse over the elements of the array {1,2,3,4,5,6,7,8} using for each loop and print all even elements.
public class ArrEvenElements {
    static void displayEvenElements(int[] arr) {
        for (int element:
             arr) {
            if (element % 2 == 0) {
                System.out.println(element);
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("Even elements of array are: ");
        displayEvenElements(a);
    }
}
