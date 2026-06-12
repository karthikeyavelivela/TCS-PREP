import java.util.Scanner;

public class Program05_StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();
        
        char grade;
        if (marks >= 90 && marks <= 100) {
            grade = 'A';
        } else if (marks >= 80 && marks < 90) {
            grade = 'B';
        } else if (marks >= 70 && marks < 80) {
            grade = 'C';
        } else if (marks >= 60 && marks < 70) {
            grade = 'D';
        } else if (marks < 60) {
            grade = 'F';
        } else {
            grade = 'X';
            System.out.println("Invalid marks entered");
        }
        
        if (grade != 'X') {
            System.out.println("Grade: " + grade);
        }
        
        sc.close();
    }
}
