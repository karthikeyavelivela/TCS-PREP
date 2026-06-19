import java.util.Scanner;

public class Program10_RemoveWhiteSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        // Remove all whitespaces using replace()
        String noSpaces = str.replaceAll("\\s", "");
        
        System.out.println("Original string: " + str);
        System.out.println("String without spaces: " + noSpaces);
        
        sc.close();
    }
}
