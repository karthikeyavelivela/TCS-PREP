import java.util.Scanner;

public class Program02_ConvertToUppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        // Convert to uppercase using toUpperCase()
        String uppercase = str.toUpperCase();
        
        System.out.println("Original string: " + str);
        System.out.println("Uppercase string: " + uppercase);
        
        sc.close();
    }
}
