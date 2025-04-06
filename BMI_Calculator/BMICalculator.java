package BMI_Calculator;
import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("**WELCOME TO BMI CALCULATOR**");

        System.out.print("Please Enter Your Weight(kg)     : ");
        double weight = scanner.nextDouble();

        System.out.print("Please Enter Your Height(meters) : ");
        double height = scanner.nextDouble();

        double BMI = weight / (height * height);

        String healthStatus = 
        (BMI < 18.5) ? "Underweight" :
        (BMI >= 18.5 && BMI < 24.9) ? "Normal" :
        (BMI >= 25 && BMI < 29.9) ? "Overweight" :
        "Obese";

        System.out.println("=== BMI Report ===");
        System.out.println("Your BMI      : " + BMI);
        System.out.println("Health Status : " + healthStatus);

    }
}
