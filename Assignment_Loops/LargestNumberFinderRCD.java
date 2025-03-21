package Assignment_Loops;
import java.util.Scanner;

public class LargestNumberFinderRCD {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int number = 0, largestNum = 0;

        while(number != -1){
            System.out.print("Enter a number (-1 to stop): ");
            number = scan.nextInt();

            if(number > largestNum){
                largestNum = number;
            }

        }

        System.out.println("The largest number entered is: " + largestNum);
    }
}
