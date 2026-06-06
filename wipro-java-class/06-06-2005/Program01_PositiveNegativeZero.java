// Check Whether a Number is Positive, Negative, or Zero
import java.util.Scanner;

public class Program01_PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        // if-else-if logic
        if (num > 0) {
            System.out.println(num + " is Positive");
        } else if (num < 0) {
            System.out.println(num + " is Negative");
        } else {
            System.out.println(num + " is Zero");
        }
        
        sc.close();
    }
}
