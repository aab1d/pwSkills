package Assignment3;

//This program checks two if conditions on a pair of variables (a & b) using logical AND & logical OR operators.
public class VariableCheck {
    public static void main(String[] args) {
        int a = 55;
        int b = 70;
        System.out.println("For two variables, a = 55 and b = 70, we have");
        if ( a < 50 && a < b) {
            System.out.println("Both a < 50 and a < b are true.");
        }
        if (a < 50 || a < b) {
            System.out.println("Either a < 50 or a < b is true.");
        }
    }
}
