import java.util.Scanner;

public class Program07_CountEvenOdd {
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
        int evenCount = 0;
        int oddCount = 0;
        
        // Traverse the array
        for (int i = 0; i < size; i++) {
            // Check element % 2 == 0
            if (arr[i] % 2 == 0) {
                // Count even numbers
                evenCount++;
            } else {
                // Count odd numbers
                oddCount++;
            }
        }
        
        // Display both counts
        System.out.println("\nCount of Even numbers: " + evenCount);
        System.out.println("Count of Odd numbers: " + oddCount);
        
        sc.close();
    }
}
