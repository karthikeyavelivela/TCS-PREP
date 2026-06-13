import java.util.Scanner;

public class Program06_LinearSearch {
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
        
        // Input key element to search
        System.out.print("\nEnter element to search: ");
        int key = sc.nextInt();
        
        // Traverse the array
        boolean found = false;
        int position = -1;
        
        for (int i = 0; i < size; i++) {
            // Compare each element with the key
            if (arr[i] == key) {
                found = true;
                position = i + 1;  // Position from 1
                break;
            }
        }
        
        // If found, display its position; Otherwise, display "Not Found"
        if (found) {
            System.out.println("Element found at position: " + position);
        } else {
            System.out.println("Not Found");
        }
        
        sc.close();
    }
}
