import java.util.Scanner;

public class Program08_CountWordsInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        
        // Split the sentence by spaces
        String[] words = sentence.split(" ");
        
        // Count non-empty words
        int wordCount = 0;
        for (String word : words) {
            if (!word.isEmpty()) {
                wordCount++;
            }
        }
        
        System.out.println("Number of words: " + wordCount);
        System.out.println("Words are:");
        for (String word : words) {
            if (!word.isEmpty()) {
                System.out.println("  - " + word);
            }
        }
        
        sc.close();
    }
}
