package Assignment4;

//This program takes cost price (C.P.) and selling price (S.P.) and prints profit or loss based on these inputs.
import java.util.Scanner;

public class CalculateProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cost price (C.P.): ");
        int cp = sc.nextInt();
        System.out.println("Enter selling price(S.P.): ");
        int sp = sc.nextInt();
        if (sp >= cp) {
            System.out.println("Profit = " + (sp - cp));
        }
        else System.out.println("Loss = " + (cp - sp));
    }
}
