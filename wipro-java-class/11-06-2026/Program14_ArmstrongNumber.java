import java.util.Scanner;

public class Program14_ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;
        int temp = num;
        
        // Count the number of digits
        int digitCount = 0;
        int tempCount = num;
        while (tempCount > 0) {
            digitCount++;
            tempCount /= 10;
        }
        
        // Calculate sum of each digit raised to power of digitCount
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digitCount);
            temp /= 10;
        }
        
        if (num == sum) {
            System.out.println(num + " is an Armstrong Number");
        } else {
            System.out.println(num + " is not an Armstrong Number");
        }
        
        sc.close();
    }
}
