import java.util.Scanner;

public class Program11_CompareStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();
        
        // Compare two strings using equals()
        if (str1.equals(str2)) {
            System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are equal.");
        } else {
            System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are not equal.");
        }
        
        sc.close();
    }
}
