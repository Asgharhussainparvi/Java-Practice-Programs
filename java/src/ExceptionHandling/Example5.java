package ExceptionHandling;

import java.io.FileInputStream;
import java.io.IOException;

public class Example5 {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("file.txt");
            // Some I/O operation that may throw an IOException
        } catch (IOException e) {
            System.out.println("IOException occurred: " + e.getMessage());
        }
    }
}