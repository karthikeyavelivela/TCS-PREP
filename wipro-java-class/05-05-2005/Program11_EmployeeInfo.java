import java.util.Scanner;

public class Program11_EmployeeInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Employee Number: ");
        int empNo = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Designation: ");
        String designation = scanner.nextLine();
        System.out.print("Enter Salary: ");
        double salary = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter Date of Joining (DD/MM/YYYY): ");
        String jod = scanner.nextLine();
        System.out.print("Enter Date of Birth (DD/MM/YYYY): ");
        String dob = scanner.nextLine();
        
        System.out.println("\n--- Employee Information ---");
        System.out.println("Employee Number: " + empNo);
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
        System.out.println("Date of Joining: " + jod);
        System.out.println("Date of Birth: " + dob);
        
        scanner.close();
    }
}
