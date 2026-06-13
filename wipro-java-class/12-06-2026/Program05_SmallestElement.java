import java.util.Scanner;

public class Program05_SmallestElement {
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
        
        // Assume the first element is the smallest
        int smallest = arr[0];
        
        // Compare with all other elements
        for (int i = 1; i < size; i++) {
            // Update the smallest value if needed
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        
        // Display the result
        System.out.println("\nSmallest element in array: " + smallest);
        
        sc.close();
    }
}
