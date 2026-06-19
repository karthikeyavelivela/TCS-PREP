import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    float marks;

    void readDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Marks: ");
        marks = sc.nextFloat();
    }

    void displayDetails() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

public class Program01_StudentDetails {
    public static void main(String[] args) {
        Student student = new Student();
        student.readDetails();
        student.displayDetails();
    }
}
