import java.util.Scanner;

public class Program09_CopyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input array size
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        
        // Create first array
        int[] arr1 = new int[size];
        
        // Input array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr1[i] = sc.nextInt();
        }
        
        // Create another array
        int[] arr2 = new int[size];
        
        // Copy each element
        for (int i = 0; i < size; i++) {
            arr2[i] = arr1[i];
        }
        
        // Display the original array
        System.out.println("\nOriginal array:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr1[i] + " ");
        }
        
        // Display the copied array
        System.out.println("\nCopied array:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        
        sc.close();
    }
}
