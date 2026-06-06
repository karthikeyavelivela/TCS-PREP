import java.util.Scanner;

public class Program10_StudentInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Student Number: ");
        int sno = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Student Name: ");
        String sname = scanner.nextLine();
        System.out.print("Enter Father's Name: ");
        String fname = scanner.nextLine();
        System.out.print("Enter Branch: ");
        String branch = scanner.nextLine();
        System.out.print("Enter Contact Number: ");
        long contactNo = scanner.nextLong();
        
        System.out.println("\n--- Student Information ---");
        System.out.println("Student Number: " + sno);
        System.out.println("Student Name: " + sname);
        System.out.println("Father's Name: " + fname);
        System.out.println("Branch: " + branch);
        System.out.println("Contact Number: " + contactNo);
        
        scanner.close();
    }
}
