import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Billing {
    private static Map<String, Double> items = new HashMap<>();

    static {
        
        items.put("apple", 0.50);
        items.put("banana", 0.40);
        items.put("orange", 0.60);
        items.put("bread", 2.00);
        items.put("milk", 1.50);
    }

    public static double calculateBill(Map<String, Integer> cart) {
        double total = 0;
        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
            String item = entry.getKey();
            int quantity = entry.getValue();
            if (items.containsKey(item)) {
                total += items.get(item) * quantity;
            } else {
                System.out.println("Item '" + item + "' not found in inventory.");
            }
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> cart = new HashMap<>();

        while (true) {
            System.out.println("\nAvailable items:");
            for (Map.Entry<String, Double> entry : items.entrySet()) {
                System.out.println(entry.getKey() + ": $" + entry.getValue());
            }

            System.out.print("\nEnter item to purchase (or 'done' to finish): ");
            String item = scanner.nextLine().toLowerCase();
            if (item.equals("done")) {
                break;
            }

            if (items.containsKey(item)) {
                System.out.print("Enter quantity of " + item + ": ");
                int quantity = scanner.nextInt();
                cart.put(item, cart.getOrDefault(item, 0) + quantity);
                scanner.nextLine(); // Consume newline
            } else {
                System.out.println("Invalid item! Please select from the list.");
            }
        }

        double totalBill = calculateBill(cart);
        System.out.printf("\nTotal bill amount: $%.2f\n", totalBill);
        scanner.close();
    }
}