import java.util.HashMap;

public class StudentMapExample {

    public static void main(String[] args) {
        // Create a HashMap to store student information (key: ID, value: Name)
        HashMap<String, Integer> studentGrades = new HashMap<>();
        studentGrades.put("Alice", 90);
        studentGrades.put("Bob", 85);
        Integer aliceGrade = studentGrades.get("Alice"); // aliceGrade will be 90
        boolean hasBobGrade = studentGrades.containsKey("Bob"); // hasBobGrade will be true
        System.out.println("Alice grade is :"+ aliceGrade);
        System.out.println("is there Bob's garde there  :"+hasBobGrade );
    }
}