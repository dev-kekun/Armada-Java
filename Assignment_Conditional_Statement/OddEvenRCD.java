package Assignment_Conditional_Statement;
import java.util.Scanner;

public class OddEvenRCD {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scan.nextInt();

        if(num % 2 == 0){
            System.out.print(num + " is even number.");
        }else{
            System.out.print(num + " is an odd number.");
        }
    }
}
