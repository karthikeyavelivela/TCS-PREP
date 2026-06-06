// Find the Largest of Two Numbers
import java.util.Scanner;

public class Program02_LargestOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input two numbers
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        
        // if-else logic
        if (num1 > num2) {
            System.out.println("Largest number is: " + num1);
        } else {
            System.out.println("Largest number is: " + num2);
        }
        
        sc.close();
    }
}
