import java.util.ArrayList;
import java.util.Scanner;

class Invoice {
    private String itemNumber;
    private String description;
    private int quantity;
    private double pricePerItem;

    // Setters
    public void setItemNumber(String itemNumber) { this.itemNumber = itemNumber; }
    public void setDescription(String description) { this.description = description; }
    public void setQuantity(int quantity) { this.quantity = Math.max(0, quantity); }
    public void setPricePerItem(double pricePerItem) { this.pricePerItem = Math.max(0.0, pricePerItem); }

    // Getters
    public String getItemNumber() { return itemNumber; }
    public String getDescription() { return description; }
    public int getQuantity() { return quantity; }
    public double getPricePerItem() { return pricePerItem; }

    // Method to calculate invoice amount
    public double getInvoiceAmount() {
        return quantity * pricePerItem;
    }
}

public class InvoiceApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Invoice> invoices = new ArrayList<>();  // List to store multiple invoices

        while (true) {
            System.out.println("Option");
            System.out.println("[1] Create an Invoice");
            System.out.println("[2] Print Invoice");
            System.out.println("[3] Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // consume newline

            if (option == 1) {
                // Create a new invoice object for each entry
                Invoice invoice = new Invoice();
                
                System.out.print("Enter Item Number: ");
                invoice.setItemNumber(scanner.nextLine());
                
                System.out.print("Enter Item Description: ");
                invoice.setDescription(scanner.nextLine());
                
                System.out.print("Quantity: ");
                invoice.setQuantity(scanner.nextInt());
                
                System.out.print("Price: ");
                invoice.setPricePerItem(scanner.nextDouble());
                
                invoices.add(invoice);  // Add the invoice to the list
                System.out.println("Invoice Created!");
            } 
            else if (option == 2) {
                System.out.println("Item Number\tDescription\tQuantity\tPrice\tTotal Amount");
                
                // Loop through the list and print each invoice
                for (Invoice invoice : invoices) {
                    System.out.println(invoice.getItemNumber() + "\t\t" + 
                                       invoice.getDescription() + "\t\t" + 
                                       invoice.getQuantity() + "\t\t" + 
                                       invoice.getPricePerItem() + "\t\tPHP " + 
                                       invoice.getInvoiceAmount());
                }
            } 
            else if (option == 3) {
                break;
            }
        }

        scanner.close();
    }
}
