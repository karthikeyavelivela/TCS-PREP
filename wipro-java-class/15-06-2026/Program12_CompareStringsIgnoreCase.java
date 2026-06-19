import java.util.Scanner;

public class Program12_CompareStringsIgnoreCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();
        
        // Compare two strings ignoring case using equalsIgnoreCase()
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are equal (ignoring case).");
        } else {
            System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are not equal (ignoring case).");
        }
        
        sc.close();
    }
}
