package Assignment18;

import java.util.ArrayList;
import java.util.Scanner;

public class AListDelete {
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
        if(list.size() < 3) {
            System.out.println("The size of list is smaller than 3");
            return;
        }
        list.remove(2);
        System.out.println("Updated list (After removing third element): ");
        System.out.println(list);
    }
}
