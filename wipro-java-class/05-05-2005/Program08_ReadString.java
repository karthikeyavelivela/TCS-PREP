import java.util.Scanner;

public class Program08_ReadString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.println("You entered: " + str);
        scanner.close();
    }
}
