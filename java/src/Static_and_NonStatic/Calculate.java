package Static_and_NonStatic;

public class Calculate {
    // static method
    public static int Sum(int a, int b) {
        return a+b;
    }

    public static void main(String[] args) {
        // calling the static method
        int result=Calculate.Sum(5, 7);
        System.out.println("Result: "+result);
    }
}
