package ExceptionHandling;

public class Example4 {
    public static void main(String[] args){
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[4]); // This will throw an ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurred: " +
                    e.getMessage());
        }
    }
}
