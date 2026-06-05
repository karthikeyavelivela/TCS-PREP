import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c = sc.nextDouble();
        double f = (c * 9.0 / 5.0) + 32.0;
        if (f == (long) f) {
            System.out.println((long) f);
        } else {
            System.out.println(f);
        }
        sc.close();
    }
}
