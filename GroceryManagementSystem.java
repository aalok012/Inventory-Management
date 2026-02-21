import java.util.Scanner;

/**
 * GroceryManagementSystem
 *
 * A simple grocery inventory management system implemented using
 * parallel arrays. Each index across arrays refers to the same item.
 *
 * Features:
 * -Display inventory
 * -Restock items
 * -Menu-driven interface
 *
 * This program is designed for collaborative practice.
 *
 * @author Aashish Dhital, Alok Kumar Thakur
 */
public class GroceryManagementSystem {

/**
* Prints all non-empty inventory slots.
*
* @param names  array storing item names
* @param prices array storing item prices
* @param stocks array storing item stock counts
*/

public static void printInventory(String[] names, double[] prices, int[] stocks) {

    for (int i = 0; i < names.length; i++) {

        if (names[i] != null) {
        System.out.println(names[i] + " | $" + prices[i] + " | Stock: " + stocks[i]);
        }
    }
}
    
    
    /**
     * Task 2: Searches for an item by name and updates its stock quantity.
     * If the item isn't found after checking the whole loop, prints "Item not found."
     */    
    
    public static void restockItem(String[] names, int[] stocks, String target, int amount) {

    for (int i = 0; i < names.length; i++) {
        if (names[i] != null && names[i].equals(target)) {
            stocks[i] += amount;
            return;
        }
    }
    System.out.println("Item not found.");
    }

  /**
     * Task 3: Menu-driven interface that allows the user to view inventory,
     * restock an item, or exit the program.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        String[] itemNames = new String[10];
        double[] itemPrices = new double[10];
        int[] itemStocks = new int[10];

        // Starter inventory (so menu options actually show something)
        itemNames[0] = "Milk";
        itemPrices[0] = 3.49;
        itemStocks[0] = 5;

        itemNames[1] = "Eggs";
        itemPrices[1] = 4.99;
        itemStocks[1] = 12;

        itemNames[2] = "Rice";
        itemPrices[2] = 9.99;
        itemStocks[2] = 2;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Grocery Management Menu ===");
            System.out.println("1. View Inventory");
            System.out.println("2. Restock Item");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice;
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine(); // consume newline
            } else {
                scanner.nextLine(); // clear invalid input
                System.out.println("Invalid input. Please enter 1, 2, or 3.");
                continue;
            }

            if (choice == 1) {
                printInventory(itemNames, itemPrices, itemStocks);

            } else if (choice == 2) {
                System.out.print("Enter item name to restock: ");
                String target = scanner.nextLine();

                System.out.print("Enter amount to add: ");
                int amount;
                if (scanner.hasNextInt()) {
                    amount = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                } else {
                    scanner.nextLine(); // clear invalid input
                    System.out.println("Invalid amount. Please enter a whole number.");
                    continue;
                }

                restockItem(itemNames, itemStocks, target, amount);

            } else if (choice == 3) {
                System.out.println("Exiting program.");
                break;

            } else {
                System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
        }

        scanner.close();
    }
}
