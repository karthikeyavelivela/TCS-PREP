import java.util.Scanner;

public class Program02_SumOfArrayElements {
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
        
        // Initialize sum = 0
        int sum = 0;
        
        // Traverse the array and add each element to sum
        for (int i = 0; i < size; i++) {
            sum = sum + arr[i];
        }
        
        // Display the sum
        System.out.println("\nSum of array elements: " + sum);
        
        sc.close();
    }
}
