import java.util.Scanner;

public class SimpleCalc { // New class name

    // Addition using increment
    public static int add(int a, int b) {
        int sum = a;
        for (int i = 0; i < b; i++) sum++;
        return sum;
    }

    // Subtraction using decrement
    public static int subtract(int a, int b) {
        int diff = a;
        for (int i = 0; i < b; i++) diff--;
        return diff;
    }

    // Multiplication using repeated addition
    public static int multiply(int a, int b) {
        int result = 0;
        for (int i = 0; i < b; i++) result = add(result, a);
        return result;
    }

    // Division using repeated subtraction
    public static int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero");
            return -1;
        }
        int count = 0, temp = a;
        while (temp >= b) {
            temp = subtract(temp, b);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter operation (+, -, *, /): ");
        char op = sc.next().charAt(0);

        switch(op) {
            case '+': System.out.println("Result: " + add(a, b)); break;
            case '-': System.out.println("Result: " + subtract(a, b)); break;
            case '*': System.out.println("Result: " + multiply(a, b)); break;
            case '/': 
                int res = divide(a, b);
                if (res != -1) System.out.println("Result: " + res);
                break;
            default: System.out.println("Invalid operation");
        }
    }
}
