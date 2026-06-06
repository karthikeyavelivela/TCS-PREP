// Print Even Numbers from 1 to N
import java.util.Scanner;

public class Program10_EvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input N
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        
        // for loop logic
        System.out.println("Even numbers from 1 to " + n + ":");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        
        sc.close();
    }
}
