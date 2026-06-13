import java.util.Scanner;

public class Program10_CountPositiveNegativeZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input array size
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        
        // Create array
        int[] arr = new int[size];
        
        // Input array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        
        // Initialize counters
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        
        // Traverse the array
        for (int i = 0; i < size; i++) {
            // Check whether each element is positive, negative, or zero
            if (arr[i] > 0) {
                positiveCount++;
            } else if (arr[i] < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }
        
        // Display the counts
        System.out.println("\nCount of Positive numbers: " + positiveCount);
        System.out.println("Count of Negative numbers: " + negativeCount);
        System.out.println("Count of Zero: " + zeroCount);
        
        sc.close();
    }
}
