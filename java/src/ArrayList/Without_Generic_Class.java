package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Without_Generic_Class{
public static void main(String args){
        // Without generics (type safety issue)
        ArrayList list = new ArrayList(); // Collection of type Object
        list.add("Hello");
        list.add(10); // Can potentially add any type of object

        String str1 = (String) list.get(0); // Casting required (potential ClassCastException)
        int num = (int) list.get(1); // Casting required (potential ClassCastException)


    }
}
