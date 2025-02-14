package PizzaBillGenerator;

import java.util.Scanner;

public class PizzaBill {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define pizza prices
        final double BASE_PRICE = 100.00;
        final double EXTRA_TOPPING_PRICE = 20.00;
        final double EXTRA_CHEESE_PRICE = 10.00;
        final double TAKEAWAY_CHARGE = 30.00;

        // Get user input for pizza size
        System.out.println("Welcome to Pizza Palace!");
        System.out.println("What size pizza would you like? (Small, Medium, Large) : ");
        String size = scanner.nextLine();

        // Calculate base price based on size
        double pizzaPrice = BASE_PRICE;
        if (size.equalsIgnoreCase("Medium")) {
            pizzaPrice += 20.00;
        } else if (size.equalsIgnoreCase("Large")) {
            pizzaPrice += 40.00;
        }

        // Get user input for extra toppings
        System.out.println("Would you like any extra toppings? (y/n) :");
        char hasExtraToppings = scanner.nextLine().charAt(0);
        int numberOfExtraToppings =0;
        if (hasExtraToppings == 'y' || hasExtraToppings == 'Y') {
            System.out.println("How many extra toppings would you like?");
            numberOfExtraToppings = scanner.nextInt();
            pizzaPrice += numberOfExtraToppings * EXTRA_TOPPING_PRICE;
        }

        // Get user input for extra cheese
        System.out.println("Would you like extra cheese? (y/n) :");
        char hasExtraCheese = scanner.nextLine().charAt(0);
        if (hasExtraCheese == 'y' || hasExtraCheese == 'Y') {
            pizzaPrice += EXTRA_CHEESE_PRICE;
        }

        // Get user input for takeaway
        System.out.println("Is this for takeaway? (y/n) :");
        char isTakeaway = scanner.nextLine().charAt(0);
        if (isTakeaway == 'y' || isTakeaway == 'Y') {
            pizzaPrice += TAKEAWAY_CHARGE;
        }

        // Calculate and display total bill
        System.out.println("Your pizza order comes to: RS " + pizzaPrice);

        scanner.close();
    }
}
