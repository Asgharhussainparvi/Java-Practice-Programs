package ThisKeyword;

public class Hen{
    public String name;
    public int age;

    // constructor
    public Hen(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Name changed to: " + this.name);
    }

    public void setAge(int age) {
        this.age = age;
        System.out.println("Age changed to: " + this.age);
    }

    public static void main(String[] args) {
        Hen h = new Hen("ABC", 18);
        h.setName("PQR");
        h.setAge(22);
    }
}