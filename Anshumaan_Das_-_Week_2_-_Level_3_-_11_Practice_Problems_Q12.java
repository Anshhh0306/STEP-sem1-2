import java.util.Scanner;

public class W2L3Q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter marks for 5 subjects: ");
        int[] marks = new int[5];
        int total = 0;
        for (int i = 0; i < 5; i++) {
            marks[i] = scanner.nextInt();
            total += marks[i];
        }
        double percentage = total / 5.0;
        char grade = getGrade(percentage);
        double gpa = calculateGPA(percentage);
        System.out.println("Total: " + total);
        System.out.println("Percentage: " + percentage);
        System.out.println("Grade: " + grade);
        System.out.println("GPA: " + gpa);
    }

    private static char getGrade(double percentage) {
        if (percentage >= 90) return 'A';
        else if (percentage >= 80) return 'B';
        else if (percentage >= 70) return 'C';
        else if (percentage >= 60) return 'D';
        else if (percentage >= 50) return 'E';
        else return 'F';
    }

    private static double calculateGPA(double percentage) {
        if (percentage >= 90) return 4.0;
        else if (percentage >= 80) return 3.0;
        else if (percentage >= 70) return 2.0;
        else if (percentage >= 60) return 1.0;
        else return 0.0;
    }
}