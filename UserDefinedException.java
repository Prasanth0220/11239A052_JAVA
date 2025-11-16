import java.util.Scanner;

// User-defined exception class
class DivideByZeroException extends Exception {
    public DivideByZeroException(String message) {
        super(message);
    }
}

public class UserDefinedException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("Enter numerator: ");
            int a = sc.nextInt();
            
            System.out.print("Enter denominator: ");
            int b = sc.nextInt();
            
            if (b == 0) {
                throw new DivideByZeroException("Cannot divide by zero!");
            }
            
            int result = a / b;
            System.out.println("Result: " + result);
            
        } catch (DivideByZeroException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input: " + e);
        } finally {
            System.out.println("Program execution completed.");
        }
    }
}
