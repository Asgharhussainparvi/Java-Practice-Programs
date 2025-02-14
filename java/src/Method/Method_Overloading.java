package Method;

public class Method_Overloading {
    static int plusMethod(int x, int y) {
        return x + y;
    }

    static double plusMethod(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        int myNum1 = plusMethod(8, 5);
        int myNum2 = plusMethod(9, 4);
        double myNum3 = plusMethod(4.3, 6.26);
        double myNum4 = plusMethod(5.3, 7.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
    }
}
