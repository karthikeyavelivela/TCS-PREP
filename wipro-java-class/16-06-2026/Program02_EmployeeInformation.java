import java.util.Scanner;

class Employee {
    int empId;
    String name;
    double salary;

    void acceptDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        empId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Salary: ");
        salary = sc.nextDouble();
    }

    void displayDetails() {
        System.out.println("\n--- Employee Details ---");
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

public class Program02_EmployeeInformation {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.acceptDetails();
        employee.displayDetails();
    }
}
