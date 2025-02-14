package ExceptionHandling;

public class Example1 {
    public static void main(String[] args) {
        try {
            int userInput = Integer.parseInt(args[0]);  // Assuming a number is provided as input
            int result = 10 / userInput;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input. Please enter a number.");
        } finally {
            // Add any cleanup code here (e.g., closing resources)
        }
    }
}

