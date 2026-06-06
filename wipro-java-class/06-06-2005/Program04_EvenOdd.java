// Check Whether a Number is Even or Odd
import java.util.Scanner;

public class Program04_EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        // if-else logic
        if (num % 2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }
        
        sc.close();
    }
}
