//This program prints the first multiple of both 5 and 7 (using `break;` keyword)
public class BreakFirstMultiple {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("The program will find a multiple of both 5 and 7.");
        while(true){
            if(i % 5 == 0 && i % 7 == 0)
            {
                System.out.println("Found number: " + i);
                break;
            }
            System.out.println("Not found, iterating...");
            i++;
        }
    }
}
