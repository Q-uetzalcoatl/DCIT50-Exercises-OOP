class Purchase {
    String itemName;
    int quantity;
    double pricePerItem;

    // Method to calculate the total amount
    double calculateTotalAmount() {
        return quantity * pricePerItem;
    }

    // Displaying purchase details
    void displayDetails() {
        System.out.println("You are purchasing " + quantity + " " + itemName + "(s) at PHP " + pricePerItem + " each");
        System.out.println("Amount due is PHP " + calculateTotalAmount());
        System.out.println("Process Completed");
    }
}

public class PurchaseApp {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        Purchase purchase = new Purchase();

        System.out.print("Enter the name of the item you are purchasing: ");
        purchase.itemName = scanner.nextLine();

        System.out.print("Enter the quantity and price separated by a space: ");
        purchase.quantity = scanner.nextInt();
        purchase.pricePerItem = scanner.nextDouble();

        purchase.displayDetails();
        
        scanner.close();
    }
}
