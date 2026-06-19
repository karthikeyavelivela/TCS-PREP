import java.util.Scanner;

public class Program13_ConcatenateStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();
        
        // Concatenate using concat() method
        String concatenated1 = str1.concat(str2);
        
        // Concatenate using + operator
        String concatenated2 = str1 + str2;
        
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        System.out.println("Concatenated (using concat()): " + concatenated1);
        System.out.println("Concatenated (using +): " + concatenated2);
        
        sc.close();
    }
}
