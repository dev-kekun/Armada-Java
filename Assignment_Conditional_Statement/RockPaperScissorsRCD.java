package Assignment_Conditional_Statement;
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissorsRCD {
    public static void main(String[] args) {
        //create an object for imports
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        //computer choice randomly
        String[] computerChoices = {"R","P","S"} ;
        int randomInt = random.nextInt(3); //chooses random 0-2

        String computerChose = computerChoices[randomInt];

        System.out.print("Enter your choice (R, P, S): ");
        String userChoice = scan.next();

        System.out.println("Computer chose: " + computerChose);
        String result = "";

        
        

        switch (userChoice.toUpperCase()) {
            case "R":
                result = 
                computerChose.equals("R") ? "Draw" : 
                computerChose.equals("P") ? "Computer wins!" :
                computerChose.equals("S") ? "You win!" : "";
                break;
            
            case "P":
                result =
                computerChose.equals("R") ? "You win!" : 
                computerChose.equals("P") ? "Draw" :
                computerChose.equals("S") ? "Computer wins!" : "";
                break;

            case "S":
                result =
                computerChose.equals("R") ? "You win!" : 
                computerChose.equals("P") ? "Computer wins!" :
                computerChose.equals("S") ? "Draw" : "";

            default:
                result = "Please choose between (R, P, S) only";
                break;
        }


        System.out.println(result);
        

    }
}
