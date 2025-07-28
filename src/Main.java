import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double score;
        String grade;
        int scholarship;

        System.out.print("Enter your score (0-100): ");
        score = input.nextDouble();

        if (score < 0 || score > 100) {
            System.out.println("Invalid score. Please enter 0 - 100.");
            return;
        }
        if (score > 95) {
            grade = "A";
            scholarship = 100;
        } else if (score >= 88) {
            grade = "B";
            scholarship = 80;
        } else if (score >= 80) {
            grade = "C";
            scholarship = 70;
        } else if (score >= 70) {
            grade = "D";
            scholarship = 60;
        } else if (score >= 50) {
            grade = "E";
            scholarship = 50;
        } else {
            grade = "F";
            scholarship = 10;
        }

        System.out.println("-------------[ Result]------------");
        System.out.println("Score " + score + " you get: ");
        System.out.println("Grade: " + grade);
        System.out.println("Scholarship: " + scholarship + "%");

    }
}