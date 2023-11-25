import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int subjects = scanner.nextInt();

        int[] marks = new int[subjects];
        for (int i = 0; i < subjects; i++) {
            System.out.print("Enter the marks obtained in subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }

        double averagePercentage = totalMarks * 1.0 / subjects;

        String grade;
        if (averagePercentage >= 91) {
            grade = "A+";
        } else if (averagePercentage >= 81) {
            grade = "A";
        } else if (averagePercentage >= 71) {
            grade = "B+";
        } else if (averagePercentage >= 61) {
            grade = "B";
        } else if (averagePercentage >= 51) {
            grade = "C+";
        } else if (averagePercentage >= 41) {
            grade = "C";
        } else {
            grade = "F";
        }

        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);
    }
}