import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {
        // Define the menu items and their prices
        String[] menuItems = {
                "Appetizer 1", "Appetizer 2", "Appetizer 3", "Appetizer 4", "Appetizer 5",
                "Entree 1", "Entree 2", "Entree 3", "Entree 4", "Entree 5",
                "Dessert 1", "Dessert 2", "Dessert 3", "Dessert 4", "Dessert 5"
        };
        double[] menuPrices = {
                5.99, 6.99, 7.99, 8.99, 9.99,
                12.99, 13.99, 14.99, 15.99, 16.99,
                4.99, 5.99, 6.99, 7.99, 8.99
        };

        // Initialize variables to track orders and revenue
        int[] orderCounts = new int[menuItems.length];
        double totalRevenue = 0.0;

        // Initialize Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Display the menu
        System.out.println("Welcome to Rashad's Restaurant!");
        System.out.println("Menu:");
        for (int i = 0; i < menuItems.length; i++) {
            System.out.println(i + 1 + ". " + menuItems[i] + " - $" + menuPrices[i]);
        }

        // Process orders
        for (int orderNumber = 1; orderNumber <= 20; orderNumber++) {
            System.out.println("\nOrder " + orderNumber + ":");
            System.out.print("Enter the number of the item you'd like to order: ");
            int choice = scanner.nextInt();
            if (choice >= 1 && choice <= menuItems.length) {
                int itemIndex = choice - 1;
                orderCounts[itemIndex]++;
                totalRevenue += menuPrices[itemIndex];
            } else {
                System.out.println("Invalid choice. Please choose a valid item.");
            }
        }

        // Display summary
        System.out.println("\nSummary:");
        System.out.println("Total money made: $" + totalRevenue);
        System.out.println("Percentage of sales for each item:");
        for (int i = 0; i < menuItems.length; i++) {
            double percentage = (orderCounts[i] * menuPrices[i] / totalRevenue) * 100;
            System.out.println(menuItems[i] + ": " + percentage + "%");
        }
        System.out.println("A list of items ordered with the number of times they're ordered:");
        for (int i = 0; i < menuItems.length; i++) {
            if (orderCounts[i] > 0) {
                System.out.println(menuItems[i] + ": " + orderCounts[i] + " times");
            }
        }

        // Close the scanner
        scanner.close();
    }
}