package Assignment7;

//Q2. Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by
//creating a class named 'Triangle' without any parameter in its constructor.
class Triangle {
    int a, b, c;
    public int perimeter() {
        return a + b + c;
    }
    public double area() {
        double s = perimeter()/2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
public class TestTriangle {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.a = 2;
        t.b = 5;
        t.c = 6;
        System.out.println("Perimeter : " + t.perimeter());
        System.out.println("Area: " + t.area());
    }
}
