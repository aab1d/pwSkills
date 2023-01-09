package Assignment7;

import java.util.Scanner;

class Employee {
    String name;
    int yearOfJoin;
    int salary;
    String address;
    void displayEmployeeInfo() {
        System.out.println(name + " \t\t " + yearOfJoin + " \t\t\t\t " + salary + " \t " + address);
    }
}
public class TestEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();

        Scanner sc = new Scanner(System.in);

        System.out.println("For 1st employee;");
        System.out.println("Enter name: ");
        e1.name = sc.next();
        System.out.println("Enter year of joining: ");
        e1.yearOfJoin = sc.nextInt();
        System.out.println("Enter salary: ");
        e1.salary = sc.nextInt();
        System.out.println("Enter address: ");
        e1.address = sc.next();

        System.out.println("For 2nd employee;");
        System.out.println("Enter name: ");
        e2.name = sc.next();
        System.out.println("Enter year of joining: ");
        e2.yearOfJoin = sc.nextInt();
        System.out.println("Enter salary: ");
        e2.salary = sc.nextInt();
        System.out.println("Enter address: ");
        e2.address = sc.next();

        System.out.println("For 3rd employee;");
        System.out.println("Enter name: ");
        e3.name = sc.next();
        System.out.println("Enter year of joining: ");
        e3.yearOfJoin = sc.nextInt();
        System.out.println("Enter salary: ");
        e3.salary = sc.nextInt();
        System.out.println("Enter address: ");
        e3.address = sc.next();

        System.out.println("The information provided is as: ");
        System.out.println("Name \t\t Year of Joining \t Salary \t\t Address ");
        e1.displayEmployeeInfo();
        e2.displayEmployeeInfo();
        e3.displayEmployeeInfo();
    }
}
