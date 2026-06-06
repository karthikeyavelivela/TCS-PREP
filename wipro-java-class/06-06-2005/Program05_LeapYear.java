// Check Whether a Year is a Leap Year
import java.util.Scanner;

public class Program05_LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input year
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        
        // if-else logic for leap year
        if (year % 400 == 0) {
            System.out.println(year + " is a Leap Year");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is Not a Leap Year");
        }
        
        sc.close();
    }
}
