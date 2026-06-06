// Print Numbers from 1 to N
import java.util.Scanner;

public class Program09_Print1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input N
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        
        // for loop logic
        System.out.println("Numbers from 1 to " + n + ":");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        sc.close();
    }
}
