import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String name;
    private int id;
    private double grade;

    public Student(String name, int id, double grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void displayStudent() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Grade: " + grade);
    }
}

class StudentManagementSystems {
    ArrayList<Student> students = new ArrayList<>();
    String schoolName = "Greenwood High School";

    public void addStudent(String name, int id, double grade) {
        students.add(new Student(name, id, grade));
        System.out.println("Student added successfully!\n");
    }

    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No student records found.\n");
            return;
        }
        System.out.println("--- Student Records ---");
        System.out.println("School: " + schoolName);
        for (int i = 0; i < students.size(); i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            students.get(i).displayStudent();
        }
        System.out.println();
    }

    public void updateStudentGrade(int id, double newGrade) {
        for (Student student : students) {
            if (student.getId() == id) {
                student.setGrade(newGrade);
                System.out.println("Grade updated successfully!\n");
                return;
            }
        }
        System.out.println("Student ID not found.\n");
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManagementSystems student = new StudentManagementSystems();

        while (true) {
            System.out.println("Welcome to the Student Management System");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update Student Grade");
            System.out.println("4. Exit");
            System.out.print("\nEnter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter student ID: ");
                    int id = scanner.nextInt();
                    System.out.print("Enter student grade: ");
                    double grade = scanner.nextDouble();
                    student.addStudent(name, id, grade);
                    break;
                case 2:
                    student.viewStudents();
                    break;
                case 3:
                    System.out.print("Enter student ID to update: ");
                    int updateId = scanner.nextInt();
                    System.out.print("Enter new grade: ");
                    double newGrade = scanner.nextDouble();
                    student.updateStudentGrade(updateId, newGrade);
                    break;
                case 4:
                    System.out.println("Thank you for using the Student Management System. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.\n");
            }
        }
    }
}
