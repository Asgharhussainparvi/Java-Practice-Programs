package ArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class With_Generic_Class {
    public static void Main(String args) {
// With generics (type safety enforced)
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Hello");
// stringList.add(10); // Compiler error: Cannot add an int to a collection of Strings

        String str2 = stringList.get(0); // No casting needed, type safety guaranteed

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(10);
// intList.add("World"); // Compiler error: Cannot add a String to a collection of Integers
        Collections.sort(stringList);
        for (String i : stringList) {
            System.out.println(i);
            Collections.sort(intList);
            for (int j : intList) {
                System.out.println(i);
            }

        }
    }
}

