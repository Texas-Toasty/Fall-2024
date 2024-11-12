package Week11;

import java.util.Scanner;

public class GPAFunction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of courses: ");
        int numCourses = scanner.nextInt();

        double[] grades = new double[numCourses];
        double[] credits = new double[numCourses];

        // Get grades and credits for each course
        for (int i = 0; i < numCourses; i++) {
            System.out.print("Enter grade (on a 4.0 scale) for course " + (i + 1) + ": ");
            grades[i] = scanner.nextDouble();
            System.out.print("Enter credits for course " + (i + 1) + ": ");
            credits[i] = scanner.nextDouble();
        }

        // Calculate GPA
        double gpa = computeGPA(grades, credits);
        System.out.printf("Your GPA is: %.2f\n", gpa);

        scanner.close();
    }

    // Method to compute GPA using grades and credits
    public static double computeGPA(double[] grades, double[] credits) {
        double totalPoints = 0.0;
        double totalCredits = 0.0;

        for (int i = 0; i < grades.length; i++) {
            totalPoints += grades[i] * credits[i];
            totalCredits += credits[i];
        }

        if (totalCredits == 0) {
            return 0.0; // Avoid division by zero if no credits
        }

        return totalPoints / totalCredits;
    }
}
