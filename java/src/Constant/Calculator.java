package Constant;


public class Calculator{
    public double Area(double radius, double Zero) {
        if (radius > 0) {
            return  Cons.PI * radius * radius;

        } else {
            System.out.println(Cons.error);
            System.out.println("Try Again , radius must be greater than 0 ");
            return  Zero;
        }
    }



    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double area = calculator.Area(-4 ,0);
        System.out.println("Circle area: " + area);
    }
}