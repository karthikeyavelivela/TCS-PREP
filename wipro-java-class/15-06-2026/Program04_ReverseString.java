import java.util.Scanner;

public class Program04_ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        // Reverse the string
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        
        System.out.println("Original string: " + str);
        System.out.println("Reversed string: " + reversed);
        
        sc.close();
    }
}
