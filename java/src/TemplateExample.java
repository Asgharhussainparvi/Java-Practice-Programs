public class TemplateExample {

    public static <T> boolean isEqual(T value1, T value2) {
        // This method can be used with any type that supports the equals() method
        return value1.equals(value2);
    }

    public static void main(String[] args) {
        String name1 = "Alice";
        String name2 = "Bob";

        int number1 = 10;
        int number2 = 10;

        // Call the isEqual method with different types
        boolean namesEqual = isEqual(name1, name2); // namesEqual will be false
        boolean numbersEqual = isEqual(number1, number2); // numbersEqual will be true

        System.out.println("Are names equal? " + namesEqual);
        System.out.println("Are numbers equal? " + numbersEqual);
    }
}
