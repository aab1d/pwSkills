package Assignment18;

import java.util.ArrayList;
import java.util.Scanner;

public class AListSwap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array list: ");
        int size = sc.nextInt();
        System.out.println("Enter the elements of the list: ");
        ArrayList<Integer> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            list.add(sc.nextInt());
        }
        System.out.println("Original List: ");
        System.out.println(list);
        System.out.println("Enter index of elements to be swapped: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        Integer tmp = list.get(a);
        list.set(a, list.get(b));
        list.set(b, tmp);

        System.out.println("Updated list: ");
        System.out.println(list);
    }
}
