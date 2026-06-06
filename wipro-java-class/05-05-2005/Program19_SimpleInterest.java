import java.util.Scanner;

public class Program19_SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Principal (P): ");
        double principal = scanner.nextDouble();
        System.out.print("Enter Rate of Interest (R) in %: ");
        double rate = scanner.nextDouble();
        System.out.print("Enter Time (T) in years: ");
        double time = scanner.nextDouble();
        
        double simpleInterest = (principal * rate * time) / 100;
        double amount = principal + simpleInterest;
        
        System.out.println("Principal: " + principal);
        System.out.println("Rate: " + rate + "%");
        System.out.println("Time: " + time + " years");
        System.out.printf("Simple Interest: %.2f\n", simpleInterest);
        System.out.printf("Amount: %.2f\n", amount);
        
        scanner.close();
    }
}
