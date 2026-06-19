import java.util.Scanner;

public class Program15_FindPositionOfCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        System.out.print("Enter a character to find: ");
        char ch = sc.nextLine().charAt(0);
        
        // Find the position of character using indexOf()
        int position = str.indexOf(ch);
        
        if (position != -1) {
            System.out.println("Position of '" + ch + "': " + position);
            System.out.println("(Note: Position is 0-based, so position " + position + " means the " + (position + 1) + "th character)");
        } else {
            System.out.println("Character '" + ch + "' not found in the string.");
        }
        
        sc.close();
    }
}
