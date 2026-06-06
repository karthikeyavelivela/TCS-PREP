import java.util.Scanner;

public class Program06_ReadDouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a double: ");
        double doubleNum = scanner.nextDouble();
        System.out.println("You entered: " + doubleNum);
        scanner.close();
    }
}
