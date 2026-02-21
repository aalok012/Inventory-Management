
public class GroceryManagementSystem {

    public static void main(String[] args) {
        String[] itemNames = new String[10];
        double[] itemPrices = new double[10];
        int[] itemStocks = new int[10];
    }
    
    

    /** Task 1: Iterates through arrays and prints non-empty inventory slots.
     * Branch - feature-display
     */
     public static void printInventory(String[] names, double[] prices, int[] stocks) {
    }


    /**
     * Task 2: Searches for an item by name and updates its stock quantity.
     * If the item isn't found after checking the whole loop, prints "Item not found."
     */    public static void restockItem(String[] names, int[] stocks, String target, int amount) {

    for (int i = 0; i < names.length; i++) {
        if (names[i] != null && names[i].equals(target)) {
            stocks[i] += amount;
            return;
        }
    }
    System.out.println("Item not found.");
    }
}