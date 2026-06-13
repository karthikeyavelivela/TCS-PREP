import java.util.Scanner;

public class Program03_AverageOfArrayElements {
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
        
        // Calculate the sum
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum = sum + arr[i];
        }
        
        // Divide the sum by the number of elements
        double average = (double) sum / size;
        
        // Display the average
        System.out.println("\nSum of array elements: " + sum);
        System.out.println("Average of array elements: " + average);
        
        sc.close();
    }
}
