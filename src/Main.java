import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double score;
        System.out.print("Enter your score (0-100): ");
        score = input.nextDouble();

        System.out.println("Score " + score + " you get: ");

        if (score > 95 && score <= 100) {
            System.out.println("Grade: A");
            System.out.println("Scholarship: Full");
        } else if (score >= 88) {
            System.out.println("Grade: B");
            System.out.println("Scholarship: 80%");
        } else if (score >= 80) {
            System.out.println("Grade: C");
            System.out.println("Scholarship: 70%");
        } else if (score >= 70) {
            System.out.println("Grade: D");
            System.out.println("Scholarship: 50%");
        } else if (score >= 50) {
            System.out.println("- Grade: E");
            System.out.println("- Scholarship: 30%");
        } else {
            System.out.println("Grade: F");
            System.out.println("Scholarship: 10%");
        }
    }
}