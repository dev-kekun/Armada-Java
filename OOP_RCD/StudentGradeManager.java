package OOP_RCD;

import java.util.Scanner;

class GradeManager {
    // calculates the average for 3 grades.
    public static double calculateAverage(double grade1, double grade2, double grade3) {
        return (grade1 + grade2 + grade3) / 3.0;
    }

    // overloaded method to calculate the average for 4 grades.
    public static double calculateAverage(double grade1, double grade2, double grade3, double grade4) {
        return (grade1 + grade2 + grade3 + grade4) / 4.0;
    }

    // determines the classification based on the average.
    public static String classifyGrade(double average) {
        if (average >= 90) {
            return "Excellent";
        } else if (average >= 80) {
            return "Good";
        } else if (average >= 70) {
            return "Average";
        } else {
            return "Needs Improvement";
        }
    }
}

public class StudentGradeManager {
    String name;
    double grade1, grade2, grade3, grade4;
    int numGrades;  // Keep track of whether we are dealing with 3 or 4 grades.

    // Constructor for 3 grades
    public StudentGradeManager(String name, double grade1, double grade2, double grade3) {
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
        this.numGrades = 3;
    }

    // Constructor for 4 grades
    public StudentGradeManager(String name, double grade1, double grade2, double grade3, double grade4) {
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
        this.grade4 = grade4;
        this.numGrades = 4;
    }

    // Method to display student details
    public void display() {
        double average;
        String classification;

        if (numGrades == 3) {
            average = GradeManager.calculateAverage(grade1, grade2, grade3);
        } else {
            average = GradeManager.calculateAverage(grade1, grade2, grade3, grade4);
        }

        classification = GradeManager.classifyGrade(average);

        System.out.println("Student: " + name);
        System.out.print("Grades: ");
        if (numGrades == 3) {
            System.out.println(grade1 + ", " + grade2 + ", " + grade3);
        } else {
            System.out.println(grade1 + ", " + grade2 + ", " + grade3 + ", " + grade4);
        }
        System.out.println("Average: " + String.format("%.2f", average));
        System.out.println("Classification: " + classification);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Collecting student name and grades from the user.
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter 3 or 4 grades (separated by space): ");
        String input = scanner.nextLine();
        String[] grades = input.split(" ");

        if (grades.length == 3) {
            double grade1 = Double.parseDouble(grades[0]);
            double grade2 = Double.parseDouble(grades[1]);
            double grade3 = Double.parseDouble(grades[2]);
            
            // Create StudentGradeManager instance with 3 grades.
            StudentGradeManager student = new StudentGradeManager(name, grade1, grade2, grade3);
            student.display();
        } else if (grades.length == 4) {
            double grade1 = Double.parseDouble(grades[0]);
            double grade2 = Double.parseDouble(grades[1]);
            double grade3 = Double.parseDouble(grades[2]);
            double grade4 = Double.parseDouble(grades[3]);
            
            // Create StudentGradeManager instance with 4 grades.
            StudentGradeManager student = new StudentGradeManager(name, grade1, grade2, grade3, grade4);
            student.display();
        } else {
            System.out.println("Please enter exactly 3 or 4 grades only.");
        }

    }
}
