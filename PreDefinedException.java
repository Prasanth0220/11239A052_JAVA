import java.util.Scanner;
import java.util.InputMismatchException;

public class PreDefinedException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("Enter numerator: ");
            int a = sc.nextInt();
            
            System.out.print("Enter denominator: ");
            int b = sc.nextInt();
            
            int result = a / b; // may throw ArithmeticException
            System.out.println("Result: " + result);
            
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid integers!");
        } finally {
            System.out.println("Program execution completed.");
        }
    }
}
