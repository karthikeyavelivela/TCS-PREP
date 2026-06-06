// Display Day Name Using Day Number
import java.util.Scanner;

public class Program08_DayName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input day number
        System.out.print("Enter day number (1-7): ");
        int day = sc.nextInt();
        
        // switch logic
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day number");
        }
        
        sc.close();
    }
}
