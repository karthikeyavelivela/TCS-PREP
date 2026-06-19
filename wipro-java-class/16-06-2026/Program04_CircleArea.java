import java.util.Scanner;

class Circle {
    double radius;
    static final double PI = 3.14159;

    void setRadius(double r) {
        radius = r;
    }

    double calculateArea() {
        return PI * radius * radius;
    }

    void display() {
        System.out.println("\n--- Circle Details ---");
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
    }
}

public class Program04_CircleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle circle = new Circle();
        
        System.out.print("Enter Radius: ");
        double radius = sc.nextDouble();
        
        circle.setRadius(radius);
        circle.display();
    }
}
