import java.util.Scanner;

public class Program08_ReverseArray {
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
        
        // Display original array
        System.out.println("\nOriginal array:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        
        // Traverse the array from the last element to the first
        // Display elements in reverse order
        System.out.println("\nReverse array:");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        sc.close();
    }
}
