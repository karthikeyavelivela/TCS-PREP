import java.util.Scanner;

class Rectangle {
    double length;
    double breadth;

    void setDimensions(double l, double b) {
        length = l;
        breadth = b;
    }

    double calculateArea() {
        return length * breadth;
    }

    void display() {
        System.out.println("\n--- Rectangle Details ---");
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Area: " + calculateArea());
    }
}

public class Program03_RectangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle rect = new Rectangle();
        
        System.out.print("Enter Length: ");
        double length = sc.nextDouble();
        System.out.print("Enter Breadth: ");
        double breadth = sc.nextDouble();
        
        rect.setDimensions(length, breadth);
        rect.display();
    }
}
