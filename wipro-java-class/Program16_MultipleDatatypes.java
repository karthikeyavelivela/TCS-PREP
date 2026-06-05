import java.util.Scanner;

public class Program16_MultipleDatatypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int intVal = scanner.nextInt();
        System.out.print("Enter a long: ");
        long longVal = scanner.nextLong();
        System.out.print("Enter a float: ");
        float floatVal = scanner.nextFloat();
        System.out.print("Enter a double: ");
        double doubleVal = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter a string: ");
        String strVal = scanner.nextLine();
        System.out.print("Enter a character: ");
        char charVal = scanner.next().charAt(0);
        
        System.out.println("\n--- Values ---");
        System.out.println("Integer: " + intVal);
        System.out.println("Long: " + longVal);
        System.out.println("Float: " + floatVal);
        System.out.println("Double: " + doubleVal);
        System.out.println("String: " + strVal);
        System.out.println("Character: " + charVal);
        
        scanner.close();
    }
}
