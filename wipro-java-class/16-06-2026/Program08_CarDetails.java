import java.util.Scanner;

class Car {
    String model;
    String company;
    double price;

    void setDetails(String m, String c, double p) {
        model = m;
        company = c;
        price = p;
    }

    void display() {
        System.out.println("\n--- Car Details ---");
        System.out.println("Model: " + model);
        System.out.println("Company: " + company);
        System.out.println("Price: Rs." + price);
    }
}

public class Program08_CarDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car car = new Car();
        
        System.out.print("Enter Car Model: ");
        String model = sc.nextLine();
        System.out.print("Enter Company: ");
        String company = sc.nextLine();
        System.out.print("Enter Price: ");
        double price = sc.nextDouble();
        
        car.setDetails(model, company, price);
        car.display();
    }
}
