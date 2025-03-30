import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    String name;
    int employeeID;
    double salary;
    String department;

    // Default constructor
    public Employee() {
        this.name = "Unknown";
        this.employeeID = 0;
        this.salary = 0.0;
        this.department = "Not Assigned";
    }

    // Parameterized constructor
    public Employee(String name, int employeeID, double salary, String department) {
        this.name = name;
        this.employeeID = employeeID;
        this.salary = salary;
        this.department = department;
    }

    // Display employee details
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + employeeID);
        System.out.println("Salary: $" + String.format("%.2f", salary));
        System.out.println("Department: " + department);
        System.out.println();
    }

    // Calculate annual salary
    public double calculateAnnualSalary() {
        return salary * 12;
    }

    // Raise salary by percentage
    public void raiseSalary(double percentage) {
        salary += salary * (percentage / 100);
    }
}

public class EmployeePayrollManagementSystem {
    ArrayList<Employee> employees = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void start() {
        while (true) {
            System.out.println("\nWelcome to the Employee Payroll Management System");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Calculate Annual Salary");
            System.out.println("4. Give Salary Raise");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    viewAllEmployees();
                    break;
                case 3:
                    calculateAnnualSalary();
                    break;
                case 4:
                    giveSalaryRaise();
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public void addEmployee() {
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();
        System.out.print("Enter employee ID: ");
        int employeeID = scanner.nextInt();
        System.out.print("Enter employee salary: ");
        double salary = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter department: ");
        String department = scanner.nextLine();

        employees.add(new Employee(name, employeeID, salary, department));
        System.out.println("Employee added successfully!");
    }

    public void viewAllEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees found.");
            return;
        }

        System.out.println("\n--- Employee Records ---");
        for (int i = 0; i < employees.size(); i++) {
            System.out.println("Employee " + (i + 1) + ":");
            employees.get(i).displayInfo();
        }
    }

    public void calculateAnnualSalary() {
        System.out.print("Enter employee ID to calculate salary: ");
        int employeeID = scanner.nextInt();
        Employee employee = findEmployeeByID(employeeID);

        if (employee != null) {
            System.out.println("Annual Salary of " + employee.name + ": $"
                    + String.format("%.2f", employee.calculateAnnualSalary()));
        } else {
            System.out.println("Employee not found.");
        }
    }

    public void giveSalaryRaise() {
        System.out.print("Enter employee ID to raise salary: ");
        int employeeID = scanner.nextInt();
        Employee employee = findEmployeeByID(employeeID);

        if (employee != null) {
            System.out.print("Enter percentage increase: ");
            double percentage = scanner.nextDouble();
            employee.raiseSalary(percentage);
            System.out.println("Salary updated successfully! New Salary: $" + String.format("%.2f", employee.salary));
        } else {
            System.out.println("Employee not found.");
        }
    }

    public Employee findEmployeeByID(int employeeID) {
        for (Employee emp : employees) {
            if (emp.employeeID == employeeID) {
                return emp;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        EmployeePayrollManagementSystem payrollSystem = new EmployeePayrollManagementSystem();
        payrollSystem.start();
    }
}
