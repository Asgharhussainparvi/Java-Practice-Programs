package ExceptionHandling;

public class Example2 {
    public static void main(String[] args){
        try {
            // Code that might throw an exception
            int result = 10 / 0; // This will throw an ArithmeticException
        } catch (Exception e) {
            // Handle any exception
            System.out.println("An exception occurred: " + e.getMessage());
        }
    }
}
