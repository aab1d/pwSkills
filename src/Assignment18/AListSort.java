package Assignment18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AListSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the list: ");
        ArrayList<Integer> list = new ArrayList<>();
        while(sc.hasNextInt()) {
            list.add(sc.nextInt());
        }
        System.out.println("Original List: ");
        System.out.println(list);
        Collections.sort(list);
        System.out.println("Sorted list: ");
        System.out.println(list);
    }
}
