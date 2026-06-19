import java.util.Scanner;

class Interest {
    double principal;
    double rate;
    double time;

    void setValues(double p, double r, double t) {
        principal = p;
        rate = r;
        time = t;
    }

    double calculateSimpleInterest() {
        return (principal * rate * time) / 100;
    }

    void display() {
        double si = calculateSimpleInterest();
        double amount = principal + si;
        System.out.println("\n--- Simple Interest Calculation ---");
        System.out.println("Principal: Rs." + principal);
        System.out.println("Rate: " + rate + "%");
        System.out.println("Time: " + time + " years");
        System.out.println("Simple Interest: Rs." + si);
        System.out.println("Total Amount: Rs." + amount);
    }
}

public class Program10_SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Interest interest = new Interest();
        
        System.out.print("Enter Principal: ");
        double principal = sc.nextDouble();
        System.out.print("Enter Rate of Interest (%): ");
        double rate = sc.nextDouble();
        System.out.print("Enter Time (years): ");
        double time = sc.nextDouble();
        
        interest.setValues(principal, rate, time);
        interest.display();
    }
}
