package ExceptionHandling;

import java.util.ArrayList;
import java.util.Scanner;

class EmptyListException extends Exception {
    public EmptyListException(String message) {
        super(message);
    }
}

class ArrayListMax {
    public static void findMax(ArrayList<Integer> list) throws EmptyListException {
        if (list.isEmpty()) {
            throw new EmptyListException("List is empty.");
        }

        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }

        System.out.println("Maximum value: " + max);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter integers (type 'done' to finish):");
        while (true) {
            String input = scanner.next();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            list.add(Integer.parseInt(input));
        }

        try {
            findMax(list);
        } catch (EmptyListException e) {
            System.out.println(e.getMessage());
            System.out.println("Try again the program ");

        }

        scanner.close();
    }
}