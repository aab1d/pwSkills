package Assignment18;

import java.util.ArrayList;
import java.util.Scanner;

public class AListOnlyPositives {
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
        System.out.println("Only Positives: ");
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if(list.get(i) >= 0) {
                found = true;
                System.out.print(list.get(i) + " ");
            }
        }
        if(found) return;
        System.out.println("NA");
    }
}
