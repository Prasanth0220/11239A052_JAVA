package operations;

import java.util.Scanner;

class Arithmetic {
    double add(double a, double b) { return a + b; }
    double sub(double a, double b) { return a - b; }
    double mul(double a, double b) { return a * b; }
    double div(double a, double b) {
        if (b == 0) throw new ArithmeticException("Cannot divide by zero!");
        return a / b;
    }
}

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Arithmetic op = new Arithmetic();

        System.out.print("Enter first number: ");
        double n1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double n2 = sc.nextDouble();

        System.out.println("\nChoose Operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");

        int choice = sc.nextInt();

        try {
            switch(choice) {
                case 1: System.out.println("Result = " + op.add(n1,n2)); break;
                case 2: System.out.println("Result = " + op.sub(n1,n2)); break;
                case 3: System.out.println("Result = " + op.mul(n1,n2)); break;
                case 4: System.out.println("Result = " + op.div(n1,n2)); break;
                default: System.out.println("Invalid choice!");
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
