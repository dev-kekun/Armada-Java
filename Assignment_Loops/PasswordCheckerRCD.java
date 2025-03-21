package Assignment_Loops;
import java.util.Scanner;

public class PasswordCheckerRCD {
    
    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);

        String password = "java123";
        String typePassword;

        do{

            System.out.print("Enter password: ");
            typePassword = scan.nextLine();

            if(typePassword.equals(password)){
                System.out.println("Access granted!");
            }else{
                System.out.println("Incorrect password. Try again.");
            }
        }while(!typePassword.equals(password));

    }
}
