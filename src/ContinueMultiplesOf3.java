//This program prints all the natural numbers from 1 to 50 except for the multiples of 3 (using `continue;`)

public class ContinueMultiplesOf3 {
    public static void main(String[] args) {
        System.out.println("List of all the values from 1 to 50 except from the multiples of 3:");
        for(int i = 1; i <= 50; i++){
            if (i % 3 == 0)     continue;
            System.out.println(i);
        }
    }
}
