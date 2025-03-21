package Assignment_Loops;
import java.util.Scanner;
import java.util.Random;

public class GuessingGameRCD {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Random random = new Random();
        
        int guessNum = random.nextInt(50 + 1); // 50 + 1 to avoid 0, if the random number is 0 it will just + 1 so the number will become 1 :)

        int enteredNum = 0, counter = 1;

        while(enteredNum != guessNum){

            System.out.print("Guess a number between 1 and 50: ");
            enteredNum = scan.nextInt();

            if (enteredNum == guessNum) {
                System.out.println("Correct! you guessed it in " + counter + " attemps ");
            }else if(enteredNum > guessNum){
                System.out.println("Too high! Try again");
            }else{
                System.out.println("Too low! Try again");
            }

            counter ++;
        }
    }
}
