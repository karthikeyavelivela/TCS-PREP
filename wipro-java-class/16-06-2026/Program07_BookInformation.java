import java.util.Scanner;

class Book {
    int bookId;
    String title;
    String author;

    void enterDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Book ID: ");
        bookId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Title: ");
        title = sc.nextLine();
        System.out.print("Enter Author: ");
        author = sc.nextLine();
    }

    void displayDetails() {
        System.out.println("\n--- Book Information ---");
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

public class Program07_BookInformation {
    public static void main(String[] args) {
        Book book = new Book();
        book.enterDetails();
        book.displayDetails();
    }
}
