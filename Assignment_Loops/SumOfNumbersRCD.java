package Assignment_Loops;
import java.util.Scanner;
public class SumOfNumbersRCD {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int num = scan.nextInt();

        int i = 1;
        int sum = 0;

        while(i <= num){
            sum += i;
            i++;
        }

        System.out.print("The sum of natural numbers from 1 to " + num + " is: " + sum);
    }
}
