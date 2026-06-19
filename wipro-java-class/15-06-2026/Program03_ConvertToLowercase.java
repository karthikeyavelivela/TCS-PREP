import java.util.Scanner;

public class Program03_ConvertToLowercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        // Convert to lowercase using toLowerCase()
        String lowercase = str.toLowerCase();
        
        System.out.println("Original string: " + str);
        System.out.println("Lowercase string: " + lowercase);
        
        sc.close();
    }
}
