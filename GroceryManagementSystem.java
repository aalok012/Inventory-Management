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

/**
* Prints all non-empty inventory slots. */
public static void printInventory(String[] names, double[] prices, int[] stocks) {

    for (int i = 0; i < names.length; i++) {

        if (names[i] != null) {
            System.out.println(names[i] + " | $" + prices[i] + " | Stock: " + stocks[i]);
        }
    }
}

    public static void main(String[] args) {
        String[] itemNames = new String[10];
        double[] itemPrices = new double[10];
        int[] itemStocks = new int[10];
    }
    
    }