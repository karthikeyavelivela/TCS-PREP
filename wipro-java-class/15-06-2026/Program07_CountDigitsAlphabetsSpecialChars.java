import java.util.Scanner;

public class Program07_CountDigitsAlphabetsSpecialChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        int digits = 0;
        int alphabets = 0;
        int specialChars = 0;
        
        // Traverse each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            // Check if character is a digit
            if (Character.isDigit(ch)) {
                digits++;
            }
            // Check if character is an alphabet
            else if (Character.isLetter(ch)) {
                alphabets++;
            }
            // Otherwise, it is a special character (including spaces)
            else if (ch != ' ') {
                specialChars++;
            }
        }
        
        System.out.println("Number of digits: " + digits);
        System.out.println("Number of alphabets: " + alphabets);
        System.out.println("Number of special characters: " + specialChars);
        
        sc.close();
    }
}
