public class Product {
    static double discount = 10.0;
    final int productID;
    String productName;
    double price;
    int quantity;

    public Product(String productName, double price, int quantity, int productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    public void displayProductDetails() {
        if (this instanceof Product) {
            System.out.println("Product Name: " + productName);
            System.out.println("Product ID: " + productID);
            System.out.println("Price: " + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
        } else {
            System.out.println("This is not a valid Product object.");
        }
    }

    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 1000.00, 2, 101);
        Product product2 = new Product("Smartphone", 500.00, 3, 102);

        product1.displayProductDetails();
        product2.displayProductDetails();

        updateDiscount(15.0);
        System.out.println("Updated discount for all products: " + discount + "%");
    }
}
