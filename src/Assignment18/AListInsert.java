package Assignment18;

import java.util.ArrayList;
import java.util.Scanner;

public class AListInsert {
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
        System.out.println("Enter new element to be inserted at first position: ");
        list.add(0, sc.nextInt());
        System.out.println("Updated list: ");
        System.out.println(list);
    }
}
