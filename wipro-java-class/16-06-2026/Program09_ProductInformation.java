import java.util.Scanner;

class Product {
    int productId;
    String name;
    double price;

    void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Product ID: ");
        productId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Product Name: ");
        name = sc.nextLine();
        System.out.print("Enter Price: ");
        price = sc.nextDouble();
    }

    void displayData() {
        System.out.println("\n--- Product Information ---");
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: Rs." + price);
    }
}

public class Program09_ProductInformation {
    public static void main(String[] args) {
        Product product = new Product();
        product.inputData();
        product.displayData();
    }
}
