package ExceptionHandling;

public class Example6 {
    public static void main(String[] args) {
        try {
            String str = null;
            int length = str.length(); // This will throw a NullPointerException
        } catch (NullPointerException e) {
            System.out.println("NullPointerException occurred: " + e.getMessage());
        }
    }
}
