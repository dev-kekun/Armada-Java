package Student_Grades_Analyzer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentGradesAnalyzer {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of the students: ");
        int numOfStudents = scan.nextInt();

        // creating an empty list of an array to store the grades of the student
        List<Integer> scores = new ArrayList<>();

        // Enter the grade of students based on the numofStudents input
        int i = 1;
        while (i <= numOfStudents) {
            System.out.print("Enter grade for student " + i + ": ");
            int score = scan.nextInt();
            scores.add(score);
            i++;
        }

        // sums the total grade and gets the highest and lowest grade
        int totalGrade = 0;
        int highestScore = Integer.MIN_VALUE;
        int lowestScore = Integer.MAX_VALUE;
        for (int score : scores) {

            if (score > highestScore) {
                highestScore = score;
            }
            if (score < lowestScore) {
                lowestScore = score;
            }

            totalGrade += score;
        }

        System.out.println();
        System.out.println("=== Grade Analysis ===");
        System.out.println("Total Grades: " + totalGrade);

        double averageScore = (double) totalGrade / numOfStudents;
        System.out.println("Average Grade: " + averageScore);

        System.out.println("Highest Grade: " + highestScore);
        System.out.println("Lowest Grade: " + lowestScore);

    }
}
