package Assignment8;

//This program prints the count of (lowercase) vowels present in a string.
import java.util.Scanner;

public class CountVowels {
    static int countLowercaseVowels(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.next();
        System.out.println("Number of vowels are: "+ countLowercaseVowels(input));
    }
}
