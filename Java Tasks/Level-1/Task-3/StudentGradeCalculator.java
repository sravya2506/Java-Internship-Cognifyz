import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        int[] grades = new int[n];
        int sum = 0;

        // Input grades
        for (int i = 0; i < n; i++) {
            System.out.print("Enter grade for subject " + (i + 1) + ": ");
            grades[i] = sc.nextInt();
            sum += grades[i];
        }

        // Calculate average
        double average = (double) sum / n;

        System.out.println("Average Grade: " + average);

        sc.close();
    }
}
