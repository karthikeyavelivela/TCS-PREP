import java.util.Scanner;

public class Program09_FindFrequencyOfCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        System.out.print("Enter a character to find frequency: ");
        char ch = sc.nextLine().charAt(0);
        
        int frequency = 0;
        
        // Convert both to lowercase for case-insensitive search
        str = str.toLowerCase();
        ch = Character.toLowerCase(ch);
        
        // Traverse the string
        for (int i = 0; i < str.length(); i++) {
            // Increment count when character matches
            if (str.charAt(i) == ch) {
                frequency++;
            }
        }
        
        System.out.println("Frequency of '" + ch + "': " + frequency);
        
        sc.close();
    }
}
