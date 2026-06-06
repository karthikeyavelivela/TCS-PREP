import java.util.Scanner;

public class Program18_Percentage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter marks for Subject 1: ");
        int marks1 = scanner.nextInt();
        System.out.print("Enter marks for Subject 2: ");
        int marks2 = scanner.nextInt();
        System.out.print("Enter marks for Subject 3: ");
        int marks3 = scanner.nextInt();
        
        int total = marks1 + marks2 + marks3;
        double percentage = (total / 300.0) * 100;
        
        System.out.println("Total Marks: " + total);
        System.out.printf("Percentage: %.2f%%\n", percentage);
        
        scanner.close();
    }
}
