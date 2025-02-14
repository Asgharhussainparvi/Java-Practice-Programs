package CopyConstructor;

public class Employee {
     int id;
    String name;

    // Regular constructor
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Copy constructor
    public Employee(Employee employee) {
        this.id = employee.id;
        this.name = employee.name;
    }
}