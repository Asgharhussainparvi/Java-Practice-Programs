package CopyConstructor;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "John Doe");
        Employee employee2 = new Employee(employee1);

        System.out.println("Employee 1: " + employee1.id + " " + employee1.name);
        System.out.println("Employee 2: " + employee2.id + " " + employee2.name);

    }
}