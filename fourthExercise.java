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
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        Invoice invoice = new Invoice();

        while (true) {
            System.out.println("Option");
            System.out.println("[1] Create an Invoice");
            System.out.println("[2] Print Invoice");
            System.out.println("[3] Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // consume newline

            if (option == 1) {
                System.out.print("Enter Item Number: ");
                invoice.setItemNumber(scanner.nextLine());
                System.out.print("Enter Item Description: ");
                invoice.setDescription(scanner.nextLine());
                System.out.print("Quantity: ");
                invoice.setQuantity(scanner.nextInt());
                System.out.print("Price: ");
                invoice.setPricePerItem(scanner.nextDouble());
                System.out.println("Invoice Created!");
            } else if (option == 2) {
                System.out.println("Item Number Description Quantity Price Total Amount");
                System.out.println(invoice.getItemNumber() + " " + invoice.getDescription() + " " +
                        invoice.getQuantity() + " " + invoice.getPricePerItem() + " PHP " +
                        invoice.getInvoiceAmount());
            } else if (option == 3) {
                break;
            }
        }

        scanner.close();
    }
}
