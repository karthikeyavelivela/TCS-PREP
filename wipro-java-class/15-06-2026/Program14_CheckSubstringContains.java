import java.util.Scanner;

public class Program14_CheckSubstringContains {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the main string: ");
        String mainString = sc.nextLine();
        
        System.out.print("Enter the substring to search: ");
        String substring = sc.nextLine();
        
        // Check whether string contains substring using contains()
        if (mainString.contains(substring)) {
            System.out.println("\"" + mainString + "\" contains \"" + substring + "\"");
        } else {
            System.out.println("\"" + mainString + "\" does not contain \"" + substring + "\"");
        }
        
        sc.close();
    }
}
