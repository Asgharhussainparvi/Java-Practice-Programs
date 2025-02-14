public class GenericsExample {
    public static <T> boolean isEqual(T value1, T value2) {
        // This method can be used with any type that supports the equals() method
        return value1.equals(value2);
    }
    public static void main(String[] args) {
        String name1 = "Alice";
        String name2 = "Bob";
        float num1 = 1.002F;
        float num2 = 1.200F;
        int number1 = 10;
        int number2 = 10;
        double d1 = 1.2000 ;
        double d2 = 1.2000;
        // Call the isEqual method with different types
        boolean namesEqual = isEqual(name1, name2); // namesEqual will be false
        boolean numbersEqual = isEqual(number1, number2); // numbersEqual will be true
        boolean numEqual = isEqual(num1,num2);
        boolean doubleEqual = isEqual(d1,d2);
        System.out.println("Are names equal? " + namesEqual);
        System.out.println("Are numbers equal? " + numbersEqual);
        System.out.println("Are numbers equal?" + numEqual);
        System.out.println("Are double equal?" + doubleEqual +" " + String.format("%s is equal to %s", d1, d2));
    }
}
