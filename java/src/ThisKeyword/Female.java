package ThisKeyword;

public class Female {
     String name;

    public Female(String name) {
        this.name = name;
    }
    public void printName() {
        System.out.println("Name: " + this.name);
    }

    public void doSomething() {
        this.printName(); // using this to invoke the printName method
    }

    public static void main(String[] args) {
        Female female = new Female("Maya");
        female.doSomething();
    }
}
