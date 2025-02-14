package LinkedList;


// Import the LinkedList class
import java.util.LinkedList;


public class Main {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.addFirst("Elvei");
        cars.addLast("Oovel");
        System.out.println("The Array is :" + cars);
        System.out.println("the Item at the First index :" + cars.getFirst());
        System.out.println("the Item at the Last index :" + cars.getLast());
    }
}

