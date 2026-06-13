import java.util.Scanner;

public class Program04_LargestElement {
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
        
        // Assume the first element is the largest
        int largest = arr[0];
        
        // Compare it with remaining elements
        for (int i = 1; i < size; i++) {
            // Update the largest value when a bigger element is found
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        
        // Display the largest element
        System.out.println("\nLargest element in array: " + largest);
        
        sc.close();
    }
}
