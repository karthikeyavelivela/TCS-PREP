public class Program03_PrintfMethod {
    public static void main(String[] args) {
        int intValue = 42;
        double doubleValue = 3.14;
        char charValue = 'A';
        String stringValue = "Java";
        boolean boolValue = true;
        
        System.out.printf("Integer: %d\n", intValue);
        System.out.printf("Double: %.2f\n", doubleValue);
        System.out.printf("Character: %c\n", charValue);
        System.out.printf("String: %s\n", stringValue);
        System.out.printf("Boolean: %b\n", boolValue);
    }
}
