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
 * Starts the grocery management program and handles user menu input.
 * @param args not used
 */
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String[] itemNames = new String[10];
    double[] itemPrices = new double[10];
    int[] itemStocks = new int[10];
    
    while (true) {
        System.out.println("--Grocery Management System--");
        System.out.println("1. View Inventory");
        System.out.println("2. Restock Item");
        System.out.println("3. Exit");
        System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine(); // clear newline

            if (choice == 1) {

                printInventory(itemNames, itemPrices, itemStocks);

            } else if (choice == 2) {

                System.out.print("Enter item name: ");
                String name = sc.nextLine();

                System.out.print("Enter restock amount: ");
                int amount = sc.nextInt();
                sc.nextLine();

                restockItem(itemNames, itemStocks, name, amount);

            } else if (choice == 3) {

                System.out.println("Exiting program...");
                break;

            } else {
                System.out.println("Invalid option.");
            }
        }

        sc.close();
    
    }   
}