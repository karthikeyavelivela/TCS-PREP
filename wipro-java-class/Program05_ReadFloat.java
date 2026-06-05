import java.util.Scanner;

public class Program05_ReadFloat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a float: ");
        float floatNum = scanner.nextFloat();
        System.out.println("You entered: " + floatNum);
        scanner.close();
    }
}
