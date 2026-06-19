import java.util.Scanner;

public class Program01_FindLengthOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        // Use length() method to find the length
        int length = str.length();
        
        System.out.println("Length of the string: " + length);
        
        sc.close();
    }
}
