package Assignment1;

//This program swaps value of two variables.
public class SwappingTwoNum {
    public static void main(String[] args) {
        int a = 32;
        int b = 21;
        System.out.println("Before Swapping:");
        System.out.println("A is " + a + " and B is " + b);
        //swapping happens here
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping:");
        System.out.println("A is " + a + " and B is " + b);
    }
}
