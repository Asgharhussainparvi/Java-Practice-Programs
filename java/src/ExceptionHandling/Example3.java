package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Example3 {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("file.txt"); // This will throw a FileNotFoundException
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException occurred: " + e.getMessage());
        }
    }
}
