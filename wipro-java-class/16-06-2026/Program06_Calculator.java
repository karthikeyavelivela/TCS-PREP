import java.util.Scanner;

class Calculator {
    double num1;
    double num2;

    void setNumbers(double n1, double n2) {
        num1 = n1;
        num2 = n2;
    }

    double add() {
        return num1 + num2;
    }

    double subtract() {
        return num1 - num2;
    }

    double multiply() {
        return num1 * num2;
    }

    double divide() {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Cannot divide by zero!");
            return 0;
        }
    }

    void displayResults() {
        System.out.println("\n--- Calculator Results ---");
        System.out.println("Addition: " + num1 + " + " + num2 + " = " + add());
        System.out.println("Subtraction: " + num1 + " - " + num2 + " = " + subtract());
        System.out.println("Multiplication: " + num1 + " * " + num2 + " = " + multiply());
        System.out.println("Division: " + num1 + " / " + num2 + " = " + divide());
    }
}

public class Program06_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();
        
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        
        calc.setNumbers(num1, num2);
        calc.displayResults();
    }
}
